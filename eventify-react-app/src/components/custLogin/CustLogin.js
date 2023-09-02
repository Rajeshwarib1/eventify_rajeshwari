// import React, { useState } from 'react';
// import { Link } from 'react-router-dom';
// import axios from 'axios';
// import { ToastContainer, toast } from 'react-toastify';
// import Header from '../header/Header';
// import Footer from '../footer/Footer';

// export const CustLogin= () => {
//     const [username, setUsername] = useState('');
//     const [password, setPassword] = useState('');

//     const handleSubmit = async (e) => { 
//         e.preventDefault();

//         try {
//             const userData = {
//                 username: username,
//                 password: password,
//             };

//             axios.post('http://127.0.0.1:8181/login', userData)
//             // console.log('Logged in:', response.data)
//             window.location.href='/'
//             // toast.success("login successfully")
//             console.log("login successfully")
//         } 
//             catch (error) {
//             //  toast.error("login failed");            
//              console.log("login failed");            
//         }
//     };
//     return (
//         <div> 
//             <Header/> 
//         <div className='customerLogin'>
//             <div class="login-container">
//                 <div class="login-form">
//                     <h2><b>Customer Login</b></h2>
//                     <form onSubmit={handleSubmit}>
//                         <table className='formContent'>
//                             <tbody>
//                                 <tr>
//                                     <td><label>Username:</label></td>
//                                     <td><input type="text" value={username} onChange={(e) => setUsername(e.target.value)} /></td>
//                                 </tr>
//                                 <tr>
//                                     <td><label>Password:</label></td>
//                                     <td><input type="password" value={password} onChange={(e) => setPassword(e.target.value)} /></td>
//                                 </tr>
//                             </tbody>
//                         </table>
                        
//                         <Link to='/postCustDash'><button type="submit"><b>Login</b></button><br/></Link>
                        
//                         <span>Don't have an account?</span><br />
//                         <Link to="/signup"><span><a href=''>Sign up</a> here : </span></Link>
//                     </form>
//                 </div>
//             </div>           
//         </div>
//         <Footer/>
//         </div>
//     );
// };

//---------------------------------------------------------------------------------------------
// import React, { useState } from 'react';
// // import logo from './logo.png';
// // import './LoginPages.css';
// import { Link } from 'react-router-dom';
// import axios from 'axios';
// import { ToastContainer, toast } from 'react-toastify';
// import Header from '../header/Header';
// import Footer from '../footer/Footer';


// export const CustLogin = () => {
//     const [username, setUsername] = useState('');
//     const [password, setPassword] = useState('');

//     const handleSubmit = async (e) => { // Make the function async
//         e.preventDefault();

//         try {
//             const userData = {
//                 username: username,
//                 password: password,
//             };

//             const response = await axios.post('http://localhost:8181/login', userData); // Use async/await to wait for the response
//             console.log('Logged in:', response.data);
//             window.location.href='/'
//             // toast.success("login successfully");
//             // Handle successful login here, e.g., redirect to a new page
//         } catch (error) {
//             // toast.error("login failed");
//             // toast.error("login failed");
//             // console.error(error);
//             // setError('Invalid credentials. Please try again.');
            
//         }
//     };
//     return (
         
//         <div className='customerLogin'>
            
//             <Header/> 
//             <div className='mid'>
//             <div class="login-container">
//                 <div class="login-box">
//                     <h2><b>Customer Login</b></h2>
//                     <form onSubmit={handleSubmit}>
//                         <table className='formContent'>
//                             <tbody>
//                                 <tr>
//                                     <td><label>Username:</label></td>
//                                     <td><input type="text" value={username} onChange={(e) => setUsername(e.target.value)} /></td>
//                                 </tr>
//                                 <tr>
//                                     <td><label>Password:</label></td>
//                                     <td><input type="password" value={password} onChange={(e) => setPassword(e.target.value)} /></td>
//                                 </tr>
//                             </tbody>
//                         </table>
                        
//                         <Link to='/postCustDash'><button type="submit"><b>Login</b></button><br/></Link>
                        
//                         <span>Don't have an account?</span><br />
//                         <Link to="/signup"><span><a href=''>Sign up</a> here : </span></Link>
//                     </form>                   
//                 </div>
//             </div>
//             </div>
//             <Footer/>  
//         </div>
//     );
// };

//--------------------------------------
import React, { useState } from 'react';
import { Link } from 'react-router-dom';
import axios from 'axios';
import Header from '../header/Header';
import Footer from '../footer/Footer';
import './CustLogin.css'; // Import your custom CSS file

export const CustLogin = () => {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');

    const handleSubmit = async (e) => {
        e.preventDefault();

        try {
            const userData = {
                username: username,
                password: password,
            };

            const response = await axios.post('http://localhost:8181/login', userData);
            console.log('Logged in:', response.data);
            window.location.href = '/';
        } catch (error) {
            console.log('Login failed:', error);
        }
    };

    return (
        <div className='customerLogin'>
            <Header />
            <div className='mid'>
                <div className='login-box'>  
                    <h2>Customer Login</h2><hr/><br/><br/>
                    <form onSubmit={handleSubmit}>
                        <label>Username:</label>
                        <input type="text" value={username} onChange={(e) => setUsername(e.target.value)} /><br/><br/>
                        <label>Password:</label>
                        <input type="password" value={password} onChange={(e) => setPassword(e.target.value)} /><br/><br/>
                        <Link to='/postCustDash'><button type="submit"><b>Login</b></button><br/></Link>
                    </form>
                    <p>Don't have an account? <Link to="/signup">Sign up here</Link></p>
                </div>
            </div>
            <Footer />
        </div>
    );
};
