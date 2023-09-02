import React from "react";
import './Footer.css'

const Footer=()=>{
    return(
    <footer className="footer">
      <div className="flex-container">
        <div className="column">
          <h1>About EVENTIFY</h1>
          <h5>Best Event Booking Portal</h5>
        </div>
        <div className="column">
          <ul> 
            <li>{'>'} About Us</li>
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
    );
};

export default Footer;
