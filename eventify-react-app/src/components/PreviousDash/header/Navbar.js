import React, { useState } from 'react';
import './Navbar.css';
import LoginModal from '../login/LoginModal';
import logo from '../assets/logo.png';
 
const Navbar = () => {
  const [showLoginModal, setShowLoginModal] = useState(false);

  const openLoginModal = () => {
    setShowLoginModal(true);
  };

  const closeLoginModal = () => {
    setShowLoginModal(false);
  };

  return (
    <nav className="navbar">
      <div className="logo">
        <img src={logo} alt="Eventify Logo" className="logo-image" />
        <span className="logo-text">Eventify</span>
      </div>
      <div className="nav-links">
        <button className="nav-link">Home</button>
        <div className="search-section">
          <input type="text" placeholder="Search city" className="search-input" />
          <button className="search-button">Search</button>
        </div>
        <div className="date-picker-section">
          {/*DatePicker component */}
        </div>
        <button className="nav-link" onClick={openLoginModal}>
          Login
        </button>        
      </div>
      {/* Conditionally render LoginModal */}
      {showLoginModal && <LoginModal onClose={closeLoginModal} />}
    </nav>
  );
};

export default Navbar;
