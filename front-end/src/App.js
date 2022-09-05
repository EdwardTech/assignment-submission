import './App.css';
import {useEffect} from "react";
import {useLocalState} from "./util/useLocalStorage";

function App() {

    const [jwt, setJwt] = useLocalState("", "jwt");

    useEffect(() => {
        if (!jwt) {
            const requestBody = {
                "username": "Eric",
                "password": "admin228"
            };

            fetch("api/auth/login", {
                headers: {
                    "Content-Type": "application/json",
                },
                method: "post",
                body: JSON.stringify(requestBody)
            })
                .then((response) => Promise.all([response.json(), response.headers]))
                .then(([body, headers]) => {
                    setJwt(headers.get("authorization"));
                    console.log(`JWT token: ${jwt}`);
                });
        }

    }, []);




  return (
    <div className="App">
        <h1>Assignment Submission</h1>
        <div>JWT value is {jwt}</div>
    </div>
  );
}

export default App;
