import React from 'react';

const Login = () => {
    return (
        <div>
            <div>
                <label htmlFor="username">Username</label>
                <input type="email" id="username"/>
            </div>
            <div>
                <label htmlFor="password">Password</label>
                <input type="password" id="password"/>
            </div>
        </div>
    );
};

export default Login;
