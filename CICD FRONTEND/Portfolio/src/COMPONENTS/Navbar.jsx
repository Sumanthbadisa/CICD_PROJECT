import React, { useState } from 'react';
import './Navbar.css'; // Import the CSS file

const Navbar = () => {
    // State to manage whether the mobile menu is open or not
    const [isActive, setIsActive] = useState(false);

    // Function to toggle the menu
    const toggleMenu = () => {
        setIsActive(!isActive);
    };

    return (
        <nav className="navbar">
            <div className="navbar-container">
                <a href="#home" className="nav-logo">
                    Your Name
                </a>

                {/* The onClick handler calls the toggleMenu function */}
                <div 
                    className={`hamburger-menu ${isActive ? 'active' : ''}`} 
                    onClick={toggleMenu}
                >
                    <div className="bar"></div>
                    <div className="bar"></div>
                    <div className="bar"></div>
                </div>

                {/* The 'active' class is added based on the isActive state */}
                <ul className={`nav-menu ${isActive ? 'active' : ''}`}>
                    <li className="nav-item">
                        <a href="#about" className="nav-link">About</a>
                    </li>
                    <li className="nav-item">
                        <a href="#projects" className="nav-link">Projects</a>
                    </li>
                    <li className="nav-item">
                        <a href="#contact" className="nav-link">Contact</a>
                    </li>
                </ul>
            </div>
        </nav>
    );
};

export default Navbar;