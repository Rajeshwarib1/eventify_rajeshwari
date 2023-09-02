import react from 'react';
import prettybox from './prettybox.jpg';
import logo from './logo.png';
import './RegistrationPages.css'
import { useState } from 'react';

export const ServiceProviderRegiPage = ()=>{
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
        <h2><b>Service Provider Registration</b></h2>
        <form>
            <table className='formContent'>
                <tr>
                    <td><label for="username">Username:</label></td>
                    <td><input type="text" id="username" name="username" required placeholder='Enter your username'/></td>
                </tr>
                <tr>
                    <td><label for="password">Password:</label></td>
                    <td><input type="password" id="password" name="password" required placeholder='Enter your password'/></td>
                </tr>
                <tr>
                    <td><label for="firstname">Firstname:</label></td>
                    <td><input type="text" id="firstname" name="firstname" required placeholder='Enter your first name'/></td>
                </tr>
                <tr>
                    <td><label for="lastname">Lastname:</label></td>
                    <td><input type="text" id="lastname" name="lastname" required placeholder='Enter your last name'/></td>
                </tr>
                <tr>
                    <td><label for="emailid">emailid:</label></td>
                    <td><input type="text" id="emailid" name="emailid" required placeholder='Enter your email id'/></td>
                </tr>
                <tr>
                    <td><label for="mobileno">Mobileno:</label></td>
                    <td><input type="text" id="mobileno" name="mobileno" required placeholder='Enter your mobile no'/></td>
                </tr>
                <tr>
                    <td><label for="address">Address:</label></td>
                    <td><input type="text" id="address" name="address" required placeholder='Enter your address'/></td>
                </tr>
                <tr>
                    <td><label for="gender">Gender:</label></td>
                    <td>
                        <select id="gender" name="gender" required>
                            <option value="" disabled selected>Select a type</option>
                            <option value="male">Male</option>
                            <option value="female">Female</option>
                            <option value="other">Other</option>
                        </select>
                    </td>
                </tr>
            </table>
            <button type="submit"><b>Login</b></button>
        </form>
        </div>        
            </div>

            <div className='footer'>
                <h1>Eventify CDAC Project 2023, Made By Team - BroCode</h1>
            </div> 

        </div>
    );
};

// export default ServiceProviderRegiPage;