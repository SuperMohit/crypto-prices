import React from 'react';
import './Practice.css';

const outputComp = (props) => {
   return (
   <div> 
    <p  className='p1'>{props.p1}</p>
    <p>{props.p2}</p>
   </div> 
   )
}

export default outputComp;