import React, {useEffect, useState} from 'react';

const Count = () => {
    const [count, setCount] = useState(0);

    useEffect(() => {
        document.title = `You clicled ${count} times`;
    });
    
    return (
        <div>
            <p>You clicked {count} time</p>
            <button onClick={() => setCount(count + 1)}>
                Submit
            </button>
        </div>
    );
};

export default Count;
