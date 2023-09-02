import React from 'react';
import './Venues.css';
import venue1 from './banquet.jpeg'
import venue2 from './lawns.jpg'
import venue3 from './partyhall.jpeg'
import venue4 from './fivestar.png'
import venue5 from './resort.jpg'
import venue6 from './hall.jpeg'
import Footer from '../footer/Footer'
import { Link } from 'react-router-dom';
import Header from '../header/Header';

export const Venues = () => {    
  return (   
    <div>

      <Header/>
      <div className='mid'>
    <div className='ss'>
        <h2>VENUES</h2>
    <div className="container">
        
      <div className="red-box">
        <img src={venue1} alt="Image 1" />
        <p>
          Banquet Halls : This is a description of Image 1. It can span multiple lines if needed.
        </p>
        <Link to='/bookings'><button>Book Now</button></Link>
      </div>
      <div className="red-box">
        <img src={venue2} alt="Image 2" />
        <p>
          Image 2 Description: This is a description of Image 2. It can span multiple lines if needed.
        </p>
        <Link to='/bookings'><button>Book Now</button></Link>
      </div>
      <div className="red-box">
        <img src={venue3} alt="Image 3" />
        <p>
          Image 3 Description: This is a description of Image 3. It can span multiple lines if needed.
        </p>
        <Link to='/bookings'><button>Book Now</button></Link>
      </div>
      <div className="red-box">
        <img src={venue4} alt="Image 4" />
        <p>
          Image 4 Description: This is a description of Image 4. It can span multiple lines if needed.
        </p>
        <Link to='/bookings'><button>Book Now</button></Link>
      </div>
      <div className="red-box">
        <img src={venue5} alt="Image 5" />
        <p>
          Image 5 Description: This is a description of Image 5. It can span multiple lines if needed.
        </p>
        <Link to='/bookings'><button>Book Now</button></Link>
      </div>
      <div className="red-box">
        <img src={venue6} alt="Image 6" />
        <p>
          Image 6 Description: This is a description of Image 6. It can span multiple lines if needed.
        </p>
        <Link to='/bookings'><button>Book Now</button></Link>
      </div>
    </div>
    </div>
    </div>
    <Footer/>
    </div>
  );
};

