import React from 'react';
import './CryptCard.css';
import {LineChart, Line, XAxis, YAxis, CartesianGrid, Tooltip, Legend} from 'recharts';


const chartCard = (props) => {

    console.log(props);
    return (
         
            <LineChart width={1200} height={500} data={props.data}
                margin={{ top: 30, right: 10, left: 0, bottom: 5 }}>
                <XAxis dataKey="date" />
                <YAxis />
                <CartesianGrid strokeDasharray="3 3" />
                <Tooltip />
                <Legend />
                <Line type="monotone" dataKey="price(USD)" stroke="#8884d8" activeDot={{ r: 8 }} />
            
            </LineChart>
  
)
}

export default chartCard;