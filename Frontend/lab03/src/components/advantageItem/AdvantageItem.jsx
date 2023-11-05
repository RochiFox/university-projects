import React from "react";
import "./index.css";

const AdvantagesItem = ({ image, title, subtitle }) => {
  return (
    <div className="advantages__tab">
      <img src={image} alt={title} className="advantages__image" />
      <div className="advantages__info">
        <h2 className="advantages__title">{title}</h2>
        <p className="advantages__subtitle">{subtitle}</p>
      </div>
      <a href="#" className="advantages__btn-link">
        <button className="advantages__btn" />
      </a>
    </div>
  );
};

export default AdvantagesItem;
