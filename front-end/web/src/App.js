import './App.css';

function App() {
    const requestBody = {
        "username": "Eric",
        "password": "admin228"
    }
    fetch("api/auth/login", {
        headers: {
            "Content-Type": "application/json",
        },
        method: "post",
        body: JSON.stringify(requestBody)
    })
        .then((response) => Promise.all([response.json(), response.headers]))
        .then(([body, headers]) => headers.forEach(el => console.log(el)));

  return (
    <div className="App">
        <h1>Assignment Submission</h1>
    </div>
  );
}

export default App;
