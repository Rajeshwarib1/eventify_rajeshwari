import React from 'react';

const LoginModal = ({ onClose }) => {
  const handleLogin = (e) => {
    e.preventDefault();
  };

  return (
    <div className="modal">
      <div className="modal-content">
        <h2>Login</h2>
        <form onSubmit={handleLogin}>
          <label htmlFor="username">Username:</label>
          <input type="text" id="username" name="username" /><br/><br/>

          <label htmlFor="password">Password:</label>
          <input type="password" id="password" name="password" /><br/>

          <button type="submit">Login</button>
        </form>
        <button onClick={onClose}>Close</button>
      </div>
    </div>
  );
};

export default LoginModal;
