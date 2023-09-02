import React, { useState } from 'react';
import { Link } from 'react-router-dom';
import logo from './assets/logo.png';
import city1 from './assets/city1.jpg';
import city2 from './assets/city2.png';
import city3 from './assets/city3.jpg';
import city4 from './assets/city4.jpg';
import city5 from './assets/city5.jpg';
import city6 from './assets/city6.jpg';
import city7 from './assets/city7.png';
import city8 from './assets/city8.jpg';
import city9 from './assets/city9.jpg';
import city10 from './assets/city10.jpg';
import venueImage1 from './assets/venue1.jpg'
import venueImage2 from './assets/venue2.jpg'
import venueImage3 from './assets/venue3.jpg'
import './CustDash.css'; 

const CustDash = () => {

//logic for city scrolling images
const [scrollPosition, setScrollPosition] = useState(0);
  const scrollImages = (direction) => {
    const content = document.querySelector('.image-scroll-content');
    const scrollStep = direction === 'left' ? -300 : 300; // Adjust the scroll step as needed
    const newPosition = scrollPosition + scrollStep;
    setScrollPosition(newPosition);
    content.style.transform = `translateX(${newPosition}px)`;
  };

  return (
    <div>
      {/* First Navbar */}
      <nav className="navbar">
        <div className="logo">
          <Link to='/custdash'><img src={logo} alt="Eventify Logo" className="logo-image" /></Link>
          <span className="logo-text">Eventify</span>
        </div>
        <div className="nav-links">
          <select className="city-dropdown">
            <option value="city1">Mumbai</option>
            <option value="city2">Nagpur</option>
            <option value="city3">Jalgaon</option>
            <option value="city4">Kolhapur</option>
            <option value="city5">Karad</option>
            <option value="city6">Chiplun</option>
            <option value="city6">Pune</option>
          </select>
          <Link to='/login'><button className="login-button">Login</button></Link>
        </div>
      </nav>

      {/* Second Navbar */}
      <nav className="navbar-secondary">
        <div className="navbar-secondary-links">
          <div className="navbar-dropdown">
            <button className="dropdown-button" alt="list of venues">Venues</button>
            <div className="dropdown-content">
                <select className="dropdown">
                    <option value="">Select Venues</option>
                    <option value="venue1">Banquet Halls In Nagpur</option>
                    <option value="venue2">Wedding Venues In Nagpur</option>.
                    <option value="venue3">Party Halls In Nagpur</option>.
                    <option value="venue4">5 Star Banquet Halls In Nagpur</option>.
                </select>            
            </div>
          </div>
          <div className="navbar-dropdown">
            <Link to='vendorsBookNow'><button className="dropdown-button" alt="list of vendors">Vendors</button></Link>
            <div className="dropdown-content">
                <select className="dropdown">
                    <Link to='/venuesList'><option value="">Select Vendors</option></Link>
                    <option value="vendor1">Photographers</option>
                    <option value="vendor2">Makeup Artists</option>
                    <option value="vendor3">Mehendi Artists</option>
                    <option value="vendor4">Caterers</option>
                    <option value="vendor5">Decorators</option>
                    <option value="vendor6">Anchors</option>
                    <option value="vendor7">Comedians</option>
                    <option value="vendor8">Choreographers</option>                    
                 </select>
            </div>
          </div>
          <div className="navbar-dropdown">
            <button className="dropdown-button">Event Planners</button>
            <div className="dropdown-content">
                <select className="dropdown">
                    <option value="">Select Event Planners</option>
                    <option value="eventPlanner1">Wedding Planners</option>
                    <option value="eventPlanner2">Birthday Planners</option>
                    <option value="eventPlanner3">Corporate Event Planners</option>
                    <option value="eventPlanner4">College Fest/Event Planners</option>
                    <option value="eventPlanner5">Concert Planners</option>
                    <option value="eventPlanner6">Anniversary Planners</option>
                 </select>
            </div>
          </div>
          <div className="navbar-dropdown">
            <button className="dropdown-button">Ideas for You</button>
            <div className="dropdown-content">
                <select className="dropdown">
                    <option value="">Select Ideas</option>
                    <option value="idfy1">Wedding</option>
                    <option value="idfy2">Sangeet Ceremony</option>
                    <option value="idfy3">Haldi Ceremony</option>
                    <option value="idfy4">Engagement</option>
                    <option value="idfy5">Reception</option>
                    <option value="idfy6">Birthday Party</option>
                    <option value="idfy7">Concert</option>
                    <option value="idfy8">College Fest</option>
                    <option value="idfy9">Corporate Party</option>
                    <option value="idfy10">Anniversary</option>
                 </select>
            </div>
          </div>
          <div className="navbar-dropdown">
            <button className="dropdown-button">Invites</button>
            <div className="dropdown-content">
                <select className="dropdown">
                    <option value="">Select Invites</option>
                    <option value="invite1">Wedding Invitations</option>
                    <option value="invite2">Birthday Party</option>
                    <option value="invite3">Corporate Party</option>
                    <option value="invite4">College Fest</option>
                    <option value="invite5">Wedding Anniversary</option>
                 </select>
            </div>
          </div>
            <div className="list-with-us-link">
              <Link to='/listwithus'><button>List With Us</button></Link>
            </div>
        </div>
      </nav>

      <div className="background-section">
        <div className="background-image">
        </div>
        <div className="overlay-content">
          <h1>Find Your Ideal Vendors At Best Prices</h1>
          <h2>Search. Book. Relax.</h2>
          <div className="search-dropdowns">
            <select className="dropdown">
              <option value="">Select City</option>
              <option value="city1">Nagpur</option>
              <option value="city2">Mumbai</option>
              <option value="city3">Pune</option>
              <option value="city4">Jalgaon</option>
             </select>
            <select className="dropdown">
                <option value="">Select Vendor</option>
                <option value="vendor1">Photographers</option>
                <option value="vendor2">Makeup Artists</option>
                <option value="vendor3">Mehendi Artists</option>
                <option value="vendor4">Caterers</option>
                <option value="vendor5">Decorators</option>
                <option value="vendor6">Anchors</option>
                <option value="vendor7">Comedians</option>
                <option value="vendor8">Choreographers</option> 
            </select>
            <select className="dropdown">
              <option value="">Select Occasion</option>
              <option value="occasion1">Cocktail Party</option>
              <option value="occasion2">Naming Ceremony</option>
              <option value="occasion3">Conference</option>
              <option value="occasion4">Wedding Anniversary</option>
              <option value="occasion5">Corporate Event</option>
              <option value="occasion6">Engagement</option>
              <option value="occasion7">Annual Meet</option>
              <option value="occasion8">Wedding</option>
              <option value="occasion9">Product Launch</option>
              <option value="occasion10">Mehendi Ceremony</option>
              <option value="occasion11">Seminar</option>
              <option value="occasion12">Baby Shower</option>
              <option value="occasion13">Birthday Party</option>
              <option value="occasion14">Ring Ceremony</option>
              <option value="occasion15">Thread Ceremony</option>
              <option value="occasion16">Mata ki Chowki</option>
              <option value="occasion17">Fresher/Farewell party</option>
              <option value="occasion18">Sangeet Ceremony</option>
            </select>
            <button className="search-button">Search</button>
          </div>
        </div>
      </div>

      {/* Section with scrolling images */}
      <div className="image-scroll-section">
        <h1>Cities We Are Present In</h1>
        <h3>10 Cities</h3>
        <div className="image-scroll-container">
          <div className="scroll-arrow left-arrow" onClick={() => scrollImages('left')}>←</div>
          <div className="image-scroll-content">
            <img src={city1} alt="Mumbai" ></img>
            <img src={city2} alt="Nagpur" ></img>
            <img src={city3} alt="Pune" ></img>
            <img src={city4} alt="Delhi" ></img>
            <img src={city5} alt="Kolkata" ></img>
            <img src={city6} alt="Banglore" ></img>
            <img src={city7} alt="Hyderabad" ></img>
            <img src={city8} alt="Chennai" ></img>
            <img src={city9} alt="Indore" ></img>
            <img src={city10} alt="Jaipur" ></img>
           </div>
          <div className="scroll-arrow right-arrow" onClick={() => scrollImages('right')}>→</div>
        </div>
      </div>

      {/* Popular Venue Section */}
      <div className="popular-venue-section">
        <h1>Popular Venue</h1>
        <div className="venue-cards">
          <div className="venue-card">
            <h1>The Empress Palace</h1><br/><hr/><br/>
            <img src={venueImage1} alt="Venue1" /><br/><br/><hr/> 
            <p>There isn’t anything more beautiful than celebrating the new journey of love.</p>
          </div>
          <div className="venue-card">
            <h1>Chattarpur Farms</h1><br/><hr/><br/>
            <img src={venueImage2} alt="Venue2" /><br/><br/><hr/> 
            <p>There isn’t anything more beautiful than celebrating the new journey of love.</p>
          </div>
          <div className="venue-card">
            <h1>Rani Kothi Banquet Hall</h1><br/><hr/><br/>
            <img src={venueImage3} alt="Venue3" /><br/><br/><hr/> 
            <p>There isn’t anything more beautiful than celebrating the new journey of love.</p>
          </div>
        </div>
      </div>

    {/* Footer */}
      <footer className="footer">
      <div className="flex-container">
        <div className="column">
          <h1>About EVENTIFY</h1>
          <h5>Best Event Booking Portal</h5>
        </div>
        <div className="column">
          <ul> 
            <li>{'>'}About Us</li>
            <li>{'>'} Team</li>
            <li>{'>'} Contact Us</li>
            <li>{'>'} FAQ</li>
            <li>{'>'} Create Event Website</li>
            <li>{'>'} List With Us</li>
          </ul>
        </div>
        <div className="column">
          <ul>
            <li>{'>'} Media</li>
            <li>{'>'} Add Your Venue</li>
            <li>{'>'} Feedback</li>
            <li>{'>'} Real Events</li>
            <li>{'>'} Offers</li>
          </ul>
        </div>
        <div className="column">
          <ul>
            <li>{'>'} Corporate Offerings</li>
            <li>{'>'} Jobs</li>
            <li>{'>'} Testimonial</li>
            <li>{'>'} Blog</li>
          </ul>
        </div>
        <div className="column contact">
          <h4>{'>'} Contact Us</h4>
          <p>+911234567890</p>
          <p>info.eventify@gmail.com</p>
        </div>
      </div>
      </footer>
    </div>
  );
};

export default CustDash;
