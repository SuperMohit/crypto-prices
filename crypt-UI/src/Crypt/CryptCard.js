import React from 'react';
import './CryptCard.css';
import btc from '../btc.jpeg';
import ltc from '../eth.png';
import eth from '../ltc.jpeg';
import doge from '../doge.jpeg';
import 'bootstrap/dist/css/bootstrap.min.css';

const cryptCard = (props) => {
    let logo;

    if(props.coinType ==="ETH")
        logo = eth;
    else if(props.coinType ==="BTC")
        logo = btc;
    else if(props.coinType ==="LTC")
        logo = ltc;
    else if(props.coinType ==="DOGE")
        logo = doge; 

    return (
    <div className="col-sm-3" onClick={props.clickHandler}>
    <div className="card">
        <img src={logo} alt="Avatar"/>
        <div className="container">
            <h4><b>{props.coinType}</b></h4>
            <p>Current price : <br/>{props.price}</p>
        </div>
    </div>
    </div>)
}

export default cryptCard;