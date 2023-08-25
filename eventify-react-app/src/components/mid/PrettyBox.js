import React from 'react';
import './PrettyBox.css';
import prettybox from '../assets/prettybox.jpg';

const PrettyBox = () => {
  return (
    <div className='pretty-box'>
        <img src={prettybox}></img>        
    </div>
  );
};

export default PrettyBox;
