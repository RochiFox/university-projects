import React from "react";
import MainBg from "./../../assets/images/bg-main.png";
import "./index.css";

const Info = () => {
  return (
    <div className="info">
      <img src={MainBg} alt="background" className="info__background" />
      <div className="info__text">
        <h1 className="info__title">Powerful and safe server hosting</h1>
        <p className="info__subtitle">
          Our revolutionary Cloud solution is powerful, simple, and surprisingly
          affordable. Harnessing the web has never been easier
        </p>
        <a href="#">
          <button className="info__btn">Learn more</button>
        </a>
      </div>
    </div>
  );
};

export default Info;
