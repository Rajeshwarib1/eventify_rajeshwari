import React from 'react';
import './Vendors.css';
import vendor1 from './caterer1.jpeg'
import vendor2 from './decoraters.jpg'
import vendor3 from './makeup.jpg'
import vendor4 from './mehendi.jpg'
import vendor5 from './photographer.jpg'
import vendor6 from './choreographer.jpeg'
import { Link } from 'react-router-dom';
import Header from '../header/Header';
import Footer from '../footer/Footer';

export const Vendors = () => {    
  return (
    <div>
    <Header/>
      <div className='mid'>
    <div className='ss'>
        <h2>VENDORS</h2>
    <div className="container">
        
      <div className="red-box">
        <img src={vendor1} alt="Image 1" />
        <p>
          Banquet Halls : This is a description of Image 1. It can span multiple lines if needed.
        </p>
        <Link to='/bookings'><button>Book Now</button></Link>
      </div>
      <div className="red-box">
        <img src={vendor2} alt="Image 2" />
        <p>
          Image 2 Description: This is a description of Image 2. It can span multiple lines if needed.
        </p>
        <Link to='/bookings'><button>Book Now</button></Link>
      </div>
      <div className="red-box">
        <img src={vendor3} alt="Image 3" />
        <p>
          Image 3 Description: This is a description of Image 3. It can span multiple lines if needed.
        </p>
        <Link to='/bookings'><button>Book Now</button></Link>
      </div>
      <div className="red-box">
        <img src={vendor4} alt="Image 4" />
        <p>
          Image 4 Description: This is a description of Image 4. It can span multiple lines if needed.
        </p>
        <Link to='/bookings'><button>Book Now</button></Link>
      </div>
      <div className="red-box">
        <img src={vendor5} alt="Image 5" />
        <p>
          Image 5 Description: This is a description of Image 5. It can span multiple lines if needed.
        </p>
        <Link to='/bookings'><button>Book Now</button></Link>
      </div>
      <div className="red-box">
        <img src={vendor6} alt="Image 6" />
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

