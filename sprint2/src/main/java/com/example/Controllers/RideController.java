package com.example.Controllers;


import java.util.List;

import com.example.Core.Passenger;
import com.example.Core.Ride;
import com.example.Core.Driver;
import com.example.Services.DriverService;
import com.example.Services.IDriverService;
import com.example.Services.IPassengerService;
import com.example.Services.IRideService;
import com.example.Services.PassengerService;
import com.example.Services.RideService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RideController {
    IRideService Rlist = new RideService();
    IPassengerService pService = new PassengerService();
    IDriverService dServ = new DriverService();
    @PostMapping("/rides/request/passenger/{username}")
    public Boolean add(@RequestBody Ride ride,@PathVariable String username) {
        Passenger requestedBy = pService.getPassenger(username);
        ride.setRideRequester(requestedBy);
        if(pService.getPassenger(username).loggedIn==true)
        {
            return Rlist.add(ride);
        }
        return false;
        
    }

    @GetMapping("/rides")
    public List<Ride> getAll() {
        return Rlist.getAll();
    }

    @GetMapping("/rides/{id}") 
    public Ride get(@PathVariable int id) {
        return Rlist.get(id);
    }

    @DeleteMapping("/rides/{id}/delete")
    public boolean delete(@PathVariable int id) {
        return Rlist.delete(id);
    }

    @PostMapping("/rides/end/{name}")
    public boolean end(@PathVariable String name) {
        Ride r =  Rlist.getbyDriver(name);
        Driver d = dServ.getdriver(name);
        dServ.setBalance(d, r.getPrice());
        return Rlist.EndRide(r);
    }

    @PostMapping("/rides/acceptride/{name}/{number}")
    public boolean accept(@PathVariable String name , @PathVariable int number) {
        Ride r= Rlist.get(number);
        return Rlist.acceptRide(r,number);   
    }
    
    @GetMapping("/rides/history/{name}") 
    public List<Ride> getRides(@PathVariable String name) {
        return Rlist.getRidesHistory(name);
    }


}
