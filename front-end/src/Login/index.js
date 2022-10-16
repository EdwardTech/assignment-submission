import React, {useEffect, useState} from 'react';
import {useLocalState} from "../util/useLocalStorage";

const Login = () => {
    const [jwt, setJwt] = useLocalState("", "jwt");
    const [login, setLogin] = useState({
        username: "",
        password: ""
    });

    function setDataForLogin(prop, value) {
        const newLogin = { ...login};
        newLogin[prop] = value;
        setLogin(newLogin);
    }

    function signIn() {
        if (!jwt) {
            fetch("api/auth/login", {
                headers: {
                    "Content-Type": "application/json",
                },
                method: "post",
                body: JSON.stringify(login)
            })
                .then((response) => Promise.all([response.json(), response.headers]))
                .then(([body, headers]) => {
                    setJwt(headers.get("authorization"));
                    console.log(`JWT token: ${jwt}`);
                });
        }
    }

    return (
        <div>
            <div>
                <label htmlFor="username">Username</label>
                <input
                    type="email"
                    id="username"
                    onChange={e => setDataForLogin("username", e.target.value)}
                />
            </div>
            <div>
                <label htmlFor="password">Password</label>
                <input
                    type="password"
                    id="password"
                    onChange={e => setDataForLogin("password", e.target.value)}
                />
            </div>
            <div>
                <button onClick={() => signIn()}>
                    Sign in
                </button>
            </div>
        </div>
    );
};

export default Login;
