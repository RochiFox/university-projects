import React from "react";
import "./index.css";
import FacebookLogo from "./../../assets/images/facebook.svg";
import TwitterLogo from "./../../assets/images/twitter.svg";
import InstagramLogo from "./../../assets/images/instagram.svg";

const Footer = () => {
  return (
    <div className="footer">
      <p className="footer__text">
        If you prefer not to receive emails like this, you may{" "}
        <span className="footer__text-underlining">unsubscribe</span> (c) 2019
        ServerSharing. All rights reserved.
      </p>
      <div className="footer__links">
        <a href="#">
          <img
            src={FacebookLogo}
            alt="facebook logo"
            className="footer__link"
          />
        </a>
        <a href="#">
          <img src={TwitterLogo} alt="twitter logo" className="footer__link" />
        </a>
        <a href="#">
          <img
            src={InstagramLogo}
            alt="instagram logo"
            className="footer__link"
          />
        </a>
      </div>
    </div>
  );
};

export default Footer;
