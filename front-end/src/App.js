import './App.css';
import {Route, Routes} from "react-router-dom";
import DashBoard from "./Dashboard";
import HomePage from "./HomePage";
import Login from "./Login";
import PrivateRoute from "./PrivateRoute";
import AssignmentView from "./AssignmentView";
import Count from "./TectCount";

function App() {

  return (
      <Routes>

          <Route path="dashboard" element={
              <PrivateRoute>
                  <DashBoard />
              </PrivateRoute>
          }/>

          <Route path="assignments/:id" element={
              <PrivateRoute>
                  <AssignmentView />
              </PrivateRoute>
          }/>

          <Route path="login" element={<Login />}/>

          <Route path="count" element={<Count />}/>

          <Route path="/" element={<HomePage />}/>

      </Routes>

  );
}

export default App;
