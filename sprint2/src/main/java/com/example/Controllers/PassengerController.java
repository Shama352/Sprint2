package com.example.Controllers;

import java.util.List;

import com.example.Core.Passenger;
import com.example.Services.IPassengerService;
import com.example.Services.PassengerService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassengerController {
    IPassengerService plist = new PassengerService();
	
	@GetMapping("/passenger/list")
    public List<Passenger> getAll() {
        return plist.getAllPassengers();
    }

    @GetMapping("/passenger/{name}")
    public Passenger get(@PathVariable String name) {
        return plist.getPassenger(name);
    }

    @PostMapping("/passenger/add/passenger")
    public boolean add(@RequestBody Passenger p) {
        return plist.add(p);
    }
    
    @DeleteMapping("/passenger/delete/{name}")
    public boolean delete(@PathVariable String name) {
        return plist.delete(name);
    }
    @PostMapping("/passenger/login")
    public boolean login(@RequestBody Passenger p) {
        return plist.login(p.username, p.password);
    }
}
