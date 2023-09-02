import react from 'react';
import prettybox from './prettybox.jpg';
import logo from './logo.png';
import './LoginPages.css'
import { useState } from 'react';
import { Link } from 'react-router-dom';

export const ServiceProviderLoginPage = ()=>{
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');

    return(
        <div className='customerLogin'> 
            <nav className="navbar">
                <div className="logo">
                    <img src={logo} alt="Eventify Logo" className="logo-image" />
                    <span className="logo-text"><b>Eventify</b></span>
                </div>
                <div className="nav-links">
                    <button className="nav-link"><b>Home</b></button>       
                </div>
            </nav>

                <div class="login-container">
        
        <div class="login-form">
        <h2>Service Provider Login</h2>
        <form>
            <table className='formContent'>
                <tr>
                    <td><label for="username">Username:</label></td>
                    <td><input type="text" id="username" name="username" required/></td>
                </tr>
                <tr>
                    <td><label for="password">Password:</label></td>
                    <td><input type="password" id="password" name="password" required/></td>
                </tr>
            </table>
            <button type="submit"><b>Login</b></button><br/>
            <span>Don't have an account?</span><br/>
            <Link to="/ee"><span><a href=''>Sign up</a> here : </span></Link>
        </form>
        </div>        
            </div>

            <div className='footer'>
                <h1>Eventify CDAC Project 2023, Made By Team - BroCode</h1>
            </div> 

        </div>
    );
};

// export default ServiceProviderLoginPage;