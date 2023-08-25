import React from 'react';
import Navbar from './components/header/Navbar';
import './components/header/Navbar.css';
import PrettyBox from './components/mid/PrettyBox';
import Footer from './components/footer/Footer';

const App = () => {
  return (
    <div>
        <Navbar/>
        <PrettyBox/>
        <Footer/>
    </div>
  );
};

export default App;
