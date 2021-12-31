package com.example.Controllers;


import com.example.Core.Ride;

import java.util.List;

import com.example.Core.Driver;
import com.example.Observers.RideOffer;
import com.example.Services.DriverService;
import com.example.Services.IDriverService;
import com.example.Services.IOfferService;
import com.example.Services.IRideService;
import com.example.Services.OfferService;
import com.example.Services.RideService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RideOfferController {
    IOfferService oServ = new OfferService();
    IDriverService dServ = new DriverService();
    IRideService RServ = new RideService();
    
    @PostMapping("/rides/addoffer/driver/{username}/{ID}")
    public Boolean add(@RequestBody RideOffer offer,@PathVariable int ID,@PathVariable String username) {
        Driver offerBy = dServ.getdriver(username);
        Ride r1 = RServ.get(ID); 
        return oServ.addoffer(offer, r1,offerBy);
        
    }
    
    @GetMapping("/rides/getoffers/passenger/{name}")
    public List<RideOffer> get(@PathVariable String name)
    {
        return RServ.get(name).getOffer();
    }


    
}
