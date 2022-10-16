import React, {useEffect, useState} from 'react';
import {useLocalState} from "../util/useLocalStorage";
import {Link} from "react-router-dom";
import request from "../Service/fetchService";

const DashBoard = () => {
    const [jwt, setJwt] = useLocalState("", "jwt");
    const [assignments, setAssignments] = useState(null);

    useEffect(() => {
        request("/api/assignments", "GET", jwt).then((assignmentsData) => {
                setAssignments(assignmentsData);
            });
    }, []);


    function createAssignments() {
        request("/api/assignments", "POST", jwt).then((assignment) => {
                window.location.href = `/assignments/${assignment.id}`;
            });
    }

    return (
        <div>
            {assignments ? (
                assignments.map((assignment) => (
                    <div>
                        <Link to={`/assignments/${assignment.id}`}>
                            Assignment ID: {assignment.id}
                        </Link>
                    </div>
                ))
            ) : (
                    <div>
                        Nothing
                    </div>
                )}
            <button onClick={() => createAssignments()}>Submit new assignment</button>
        </div>
    );
};

export default DashBoard;
