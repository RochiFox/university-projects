import React from "react";
import "./index.css";
import AdvantagesItem from "../advantageItem/AdvantageItem.jsx";
import Firewall from "./../../assets/images/firewall.png";
import DataAnalysis from "./../../assets/images/data-analysis.png";
import Encryption from "./../../assets/images/encryption.png";
import Protection from "./../../assets/images/protection.png";

const Advantages = () => {
  return (
    <div className="advantages">
      <div className="advantages__tabs">
        <AdvantagesItem
          image={Firewall}
          title="Firewall"
          subtitle="Our system monitors and controls incoming and outgoing network traffic"
        />
        <AdvantagesItem
          image={DataAnalysis}
          title="Data Analysis"
          subtitle="Data mining, text analytics, business intelligence and data visualization"
        />
        <AdvantagesItem
          image={Encryption}
          title="Encryption"
          subtitle="Information is encoded and can only be accessed with the encryption key"
        />
        <AdvantagesItem
          image={Protection}
          title="Protection"
          subtitle="Safeguarding important information from corruption, compromise or loss"
        />
      </div>
      <a href="#">
        <button className="advantages__explore-btn">
          Explore more about ServerSharing
        </button>
      </a>
    </div>
  );
};

export default Advantages;
