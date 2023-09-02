import React from "react";
import './CustProfile.css';
import Header from "../header/Header";
import Footer from "../footer/Footer";
import { Link } from "react-router-dom";

export const CustProfile=()=>{
    return(
    <div className="profile-page">
        <Header/>

        <div className="profile-content">
            <div className="profile-picture"> 
            {/* Circular profile picture */}
            </div>
            <ul>
                <li>
                    <h2>Personal Information</h2>
                    <p>ID: 101</p>
                    <p>Username: kedari.shubham</p>
                    <p>Password: kedari@123</p>
                    <p>Name: kedari shubham</p>
                    <p>Email ID: kedarishubham@gmail.com</p>
                    <p>Mobile Number: 123-456-7890</p>
                    <p>Address: Pune</p>
                    <p>Gender: Male</p>
                    <li><h2>Booking History</h2></li><br/>
                    <li><h2>Current Event Status</h2></li>
                </li>
            </ul>

            
      
            <div className="buttons-container">
                <button>Edit Profile</button>
                <button>Delete Profile</button>
                <Link to='/logout'><button>Logout</button></Link>
            </div>
        </div>
        <Footer/>
    </div>
    );
};

