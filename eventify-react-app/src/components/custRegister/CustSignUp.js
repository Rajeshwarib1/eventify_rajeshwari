// import React, { useState } from 'react';
// import { Link } from 'react-router-dom';
// import axios from 'axios';

// export const CustSignUp = ()=>{
//     const [username, setUsername] = useState('');
//     const [password, setPassword] = useState('');
//     const [firstName, setFirstName] = useState('');
//     const [lastName, setLastName] = useState('');
//     const [email, setEmail] = useState('');
//     const [address, setAddress] = useState('');
//     const [mobileNo, setMobileNo] = useState('');
//     const [gender, setGender] = useState('');
  
//     const handleSubmit = (e) => {
//       e.preventDefault();
  
//       const userData = {
//         username: username,
//         password: password,
//         firstName: firstName,
//         lastName: lastName,
//         email: email,
//         address: address,
//         mobileNo: mobileNo,
//         gender: gender,
//       };
//       try {
  
//       axios.post('http://localhost:8181/registerCustomer', userData)
//         .then(response => {
//           // Handle successful registration here, e.g., show a success message
//           console.log('Registered:', response.data);
//         })
//       }
//         catch(error) {
//           console.log("not saved");
//         }
//     };
//     return(
//         <div className='customerLogin'> 
            
//         <div class="login-container">
//         <div class="login-form">
//         <h2><b>Customer Registration</b></h2>
//         <form onSubmit={handleSubmit}>
//             <table className='formContent'>
//                 <tr>
//                     <td><label>Username:</label></td>
//                     <td><input type="text" value={username} onChange={(e) => setUsername(e.target.value)} /></td>
//                 </tr>
//                 <tr>
//                     <td><label>Password:</label></td>
//                     <td><input type="password" value={password} onChange={(e) => setPassword(e.target.value)} /></td>
//                 </tr>
//                 <tr>
//                     <td><label>First Name:</label></td>
//                     <td><input type="text" value={firstName} onChange={(e) => setFirstName(e.target.value)} /></td>
//                 </tr>
//                 <tr>
//                     <td><label>Last Name:</label></td>
//                     <td><input type="text" value={lastName} onChange={(e) => setLastName(e.target.value)} /></td>
//                 </tr>
//                 <tr>
//                     <td><label>Email:</label></td>
//                     <td><input type="email" value={email} onChange={(e) => setEmail(e.target.value)} /></td>
//                 </tr>
//                 <tr>
//                     <td><label>Address:</label></td>
//                     <td><input type="text" value={address} onChange={(e) => setAddress(e.target.value)} /></td>
//                 </tr>
//                 <tr>
//                     <td><label>Mobile No:</label></td>
//                     <td><input type="text" value={mobileNo} onChange={(e) => setMobileNo(e.target.value)} /></td>
//                 </tr>
//                 <tr>
//                     <td><label>Gender:</label></td>
//                     <td>
//                       <select value={gender} onChange={(e) => setGender(e.target.value)}>
//                         <option value="" disabled>Select a type</option>
//                         <option value="male">Male</option>
//                         <option value="female">Female</option>
//                         <option value="other">Other</option>
//                       </select>
//                     </td>
//                 </tr>
//             </table>
//             <button type="submit"><b>submit</b></button>
//         </form>
//         </div>        
//             </div>

//             <div className='footer'>
//                 <h1>Eventify CDAC Project 2023, Made By Team - BroCode</h1>
//             </div> 
//         </div>
//     );
// };


//-------------------------------------------------------------------------------------------

import React, { useState } from 'react';
// import logo from './logo.png';
import './CustSignUp.css';
import { Link } from 'react-router-dom';
import axios from 'axios';
import { ToastContainer, toast } from 'react-toastify';
import Header from '../header/Header';
import Footer from '../footer/Footer';


export const CustSignUp = () => {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [firstName, setFirstName] = useState('');
    const [lastName, setLastName] = useState('');
    const [email, setEmail] = useState('');
    const [address, setAddress] = useState('');
    const [mobileNo, setMobileNo] = useState('');
    const [gender, setGender] = useState('');


    const handleSubmit = async (e) => {  
        e.preventDefault();

        try {
            const userData = {
                username: username,
                password: password,
                firstName: firstName,
                lastName: lastName,
                email: email,
                address: address,
                mobileNo: mobileNo,
                gender: gender,
            };

            const response = await axios.post('http://localhost:8181/registerCustomer', userData); // Use async/await to wait for the response
            console.log('Sign up successfull:', response.data);
            window.location.href='/'

        } catch (error) {
                   
        }
    };
    return (
         
        <div className='customerLogin'>
            
            <Header/> 
            <div className='mid'>
            {/* <div class="login-container"> */}
                <div class="login-box">
                    <h2><b>Customer Registration</b></h2>
                    <form onSubmit={handleSubmit}>
                        <table className='formContent'>
                            <tbody>
                                <tr>
                                    <td><label>Username:</label></td>
                                    <td><input type="text" value={username} onChange={(e) => setUsername(e.target.value)} /></td>
                                </tr>
                                <tr>
                                    <td><label>Password:</label></td>
                                    <td><input type="password" value={password} onChange={(e) => setPassword(e.target.value)} /></td>
                                </tr>
                                <tr>
                                    <td><label>First Name:</label></td>
                                    <td><input type="firstName" value={firstName} onChange={(e) => setFirstName(e.target.value)} /></td>
                                </tr>
                                <tr>
                                    <td><label>Last Name:</label></td>
                                    <td><input type="lastName" value={lastName} onChange={(e) => setLastName(e.target.value)} /></td>
                                </tr>
                                <tr>
                      <td><label>Email:</label></td>
                      <td><input type="email" value={email} onChange={(e) => setEmail(e.target.value)} /></td>
                 </tr>
                 <tr>
                     <td><label>Address:</label></td>
                     <td><input type="text" value={address} onChange={(e) => setAddress(e.target.value)} /></td>
                 </tr>
                 <tr>
                     <td><label>Mobile No:</label></td>
                     <td><input type="text" value={mobileNo} onChange={(e) => setMobileNo(e.target.value)} /></td>
                 </tr>
                 <tr>
                     <td><label>Gender:</label></td>
                     <td>
                       <select value={gender} onChange={(e) => setGender(e.target.value)}>                         <option value="" disabled>Select a type</option>
                         <option value="male">Male</option>
                         <option value="female">Female</option>
                         <option value="other">Other</option>
                       </select>
                   </td>
                 </tr>
                            </tbody>
                        </table>
                        <Link to='/submit'><button type="submit"><b>submit</b></button></Link>
                    </form>                   
                </div>
            {/* </div> */}
            </div>
            <Footer/>  
        </div>
    );
};