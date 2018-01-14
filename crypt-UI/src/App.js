import React, { Component } from 'react';
import './App.css';
import CryptCard from './Crypt/CryptCard';
import ChartCard from './Crypt/ChartCard';
import 'bootstrap/dist/css/bootstrap.min.css';
import axios from 'axios';


class App extends Component {

  endPoint = 'http://localhost:8080/';

  
  state = {
      btcData :{},
      ethData:{},
      ltcData:{},
      dogeData:{},
      histEthData:{},
      histBtcData:{},
      histLtcData:{},
      histDogeData:{},
      histCoinData: {},
      selectedCoin:{}
}

valueChangeHandler = (event) =>{
    
  this.setState({
    paragraph2 : event.target.value
    });
}

cardClickHandler = (coinType) =>{
  console.log("clicked");
    if(coinType==="BTC"){
        this.setState({histCoinData : [...this.state.histBtcData]});
        this.setState({selectedCoin:"BTC"});
    } else if(coinType==="ETH"){
         this.setState({histCoinData : [...this.state.histEthData]});
         this.setState({selectedCoin:"ETH"});
    }
        else if(coinType==="DOGE"){
         this.setState({histCoinData : [...this.state.histDogeData]});
         this.setState({selectedCoin:"DOGE"});
    }
        else if(coinType==="LTC"){
         this.setState({histCoinData : [...this.state.histLtcData]});
         this.setState({selectedCoin:"LTC"});
    }
}



componentDidMount(){

      axios.get(this.endPoint + 'realtime/btc')
          .then(
             (response) => {
               this.setState({btcData : response.data});
             }
          )

          axios.get(this.endPoint + 'realtime/eth')
          .then(
             (response) => {
               this.setState({ethData : response.data});
             }
          )

            axios.get(this.endPoint + 'realtime/ltc')
          .then(
             (response) => {
               this.setState({ltcData : response.data});
             }
          )

             axios.get(this.endPoint + 'realtime/doge')
          .then(
             (response) => {
               this.setState({dogeData : response.data});
             }
          )

           axios.get(this.endPoint + 'eth')
          .then(
             (response) => {
               this.setState({histEthData : response.data.slice(0,100)});
             }
          )

          axios.get(this.endPoint + 'btc')
          .then(
             (response) => {
               this.setState({histBtcData : response.data.slice(0,100)});
               this.setState({histCoinData : response.data.slice(0,100)})
             }
          )

          axios.get(this.endPoint + 'ltc')
          .then(
             (response) => {
               this.setState({histLtcData : response.data.slice(0,100)});
             }
          )
            
           axios.get(this.endPoint + 'doge')
          .then(
             (response) => {
               this.setState({histDogeData : response.data.slice(0,100)});
             }
          )
            
          
}


  render() {
    const btcData ={...this.state.btcData, coinType :"BTC"};
    const ltcData ={...this.state.ltcData, coinType :"LTC"};
    const dogeData ={...this.state.dogeData, coinType :"DOGE"};
    const ethData = {...this.state.ethData, coinType :"ETH"};
    const histCoinData = [...this.state.histCoinData];
    
    const selectedCoin = this.state.selectedCoin;

    return (
     <div className="container"> 
      <div className="row">
        <CryptCard source='../btc.jpeg' price={btcData.price} coinType="BTC" clickHandler={()=>{this.cardClickHandler(btcData.coinType)}}/>
        <CryptCard source='../btc.jpeg' price={ethData.price} coinType="ETH" clickHandler={()=>{this.cardClickHandler(ethData.coinType)}}/>
        <CryptCard source='../btc.jpeg'price={ltcData.price} coinType="LTC" clickHandler={()=>{this.cardClickHandler(ltcData.coinType)}}/>
        <CryptCard source='../btc.jpeg' price={dogeData.price} coinType="DOGE" clickHandler={()=>{this.cardClickHandler(dogeData.coinType)}}/>        
     </div> 
       
    
      <div className="row">
        <ChartCard data={histCoinData} selectedCoin={selectedCoin}/>   
        </div>
      </div>  
    );
  }
}

export default App;
