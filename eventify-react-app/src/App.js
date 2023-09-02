import { React, useState } from "react";
import CustDash from "./components/customerDashboard/CustDash";
import { Route, Routes } from "react-router-dom";
import { CustLogin } from "./components/custLogin/CustLogin";
import { CustSignUp } from "./components/custRegister/CustSignUp";
import { PostCustDash } from "./components/PostCustDash/PostCustDash";
import { CustProfile } from "./components/custProfile/CustProfile";
import { ListWithUs } from "./components/listWithUs/ListWithUs";
import { BanquetHalls, Venues } from "./components/venues/Venues";
import { Bookings } from "./components/cart/Bookings";
import { Vendors } from "./components/vendors/Vendors";


// import { Route, Routes } from "react-router-dom";
// import CustomerRoutes from "./Routers/CustomerRoutes.js";
// import Admin from "./Admin/Admin";

const App = () => {
  return (
    
    <div className="max-w-[1440px] mx-auto bg-white">  
      <Routes>
        <Route path='/' element={<CustDash/>}></Route>
        <Route path='/login' element={<CustLogin/>}></Route>
        <Route path='/signup' element={<CustSignUp/>}></Route>
        <Route path='/submit' element={<PostCustDash/>}></Route>
        <Route path='/postCustDash' element={<PostCustDash/>}></Route>
        <Route path='/custProfile' element={<CustProfile/>}></Route>
        <Route path='/logout' element={<CustDash/>}></Route>
        <Route path='/listwithus' element={<ListWithUs/>}></Route>
        <Route path='/venuesList' element={<Venues/>}></Route>
        <Route path='/vendorList' element={<Vendors/>}></Route>
        <Route path='/bookings' element={<Bookings/>}></Route>
      </Routes>
    </div>
  );
};

export default App;
