in code sandbox add axios

and replace App with following :

import React, { useEffect, useState } from "react";
import "./styles.css";
import axios from "axios";

export default function App() {
  const [users, setUsers] = useState([]);
  useEffect(() => {
    getUSer();
  }, []); // Only re-subscribe if props.friend.id changes

  const getUSer = () => {
    
    axios
      .get("https://amitverma.mywire.org:8443/users")
      .then(response => {
        console.log(response.data);
        setUsers(response.data);
      })
      .catch(error => {
        console.error(error);
      });
  };

  return (
    <div className="App">
      <h1>Hello CodeSandbox</h1>
      {users?.length && users.map(u => <div>{u.firstname}</div>)}
    </div>
  );
}
