import React from 'react';
import logo from './logo.png';
import './Header.css'; 
import { Link } from 'react-router-dom';

const Header = () => {
  return (
      <nav className="navbar">
        <div className="logo">
          <Link to='/postCustDash'><img src={logo} alt="Eventify Logo" className="logo-image" /></Link>
          <span className="logo-text">Eventify</span>
        </div>
      </nav>
    );
};

export default Header;