import React from "react";
import Header from "./components/header/Header.jsx";
import Info from "./components/info/Info.jsx";
import Footer from "./components/footer/Footer.jsx";
import Advantages from "./components/advantages/Advantages.jsx";
import "./app.css";

const App = () => {
  return (
    <div className="card">
      <Header />
      <Info />
      <Advantages />
      <Footer />
    </div>
  );
};

export default App;
