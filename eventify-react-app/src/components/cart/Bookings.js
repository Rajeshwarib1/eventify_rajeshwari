import React, { useEffect, useState } from 'react';
import axios from 'axios';
import Header from '../header/Header';
import Footer from '../footer/Footer';

export const Bookings = () => {
  const [bookings, setBookings] = useState([]);

  useEffect(() => {
    fetchBookings();
  }, []);

  const fetchBookings = async () => {
    try {
      const response = await axios.get('http://localhost:8181/bookings/getall'); 
      setBookings(response.data);
    } catch (error) {
      console.error('Error fetching bookings:', error);
    }
  };

  return (
    <div className="bookings-container">
      <Header/>
      <h1>Bookings</h1>
      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>Type</th>
            <th>Description</th>
            <th>City</th>
            <th>Date</th>
            <th>Price</th>
            <th>Status</th>
          </tr>
        </thead>
        <tbody>
          {bookings.map((booking) => (
            <tr key={booking.bookingId}>
              <td>{booking.bookingId}</td>
              <td>{booking.type}</td>
              <td>{booking.description}</td>
              <td>{booking.city}</td>
              <td>{booking.date}</td>
              <td>{booking.price}</td>
              <td>{booking.status}</td>
            </tr>
          ))}
        </tbody>
      </table>
      <Footer/>
    </div>
  );
};

