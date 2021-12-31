package com.example.Controllers;

import java.util.List;

import com.example.Core.Driver;
import com.example.Core.Ride;
import com.example.Observers.FavouriteAreas;
import com.example.Services.DriverService;
import com.example.Services.IDriverService;
import com.example.Services.IRideService;
import com.example.Services.RideService;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DriverController {
    private IDriverService dServ = new DriverService();
    private IRideService RServ = new RideService();
    
	


	@GetMapping("/driver/list")
    public List<Driver> getAll() {
        return dServ.getalldrivers();
    }

    @GetMapping("/driver/{name}")
    public Driver get(@PathVariable String name) {
        return dServ.getdriver(name);
    }

    @PostMapping("/driver/add/driver")
    public boolean add(@RequestBody Driver d) {
        return dServ.add(d);
    }
    @DeleteMapping("/driver/delete/{name}")
    public boolean delete(@PathVariable String name) {
		return dServ.delete(name);
	}
    @PutMapping("/driver/delete/driver")
    public boolean update(Driver d, FavouriteAreas f) {
		return dServ.update(d,f);
	}
    @PostMapping("/driver/login")
    public boolean login(@RequestBody Driver d) {
        return dServ.login(d.username, d.password);
    }
	@GetMapping("/driver/matchedRides")
    public String getMatched(@RequestBody Driver d) {
        List<Ride> list = RServ.getAll();
        List<Driver> list2 = dServ.getalldrivers();     
         if(dServ.getMatchedRides(d,list,list2)) {
            return  "There is a request from your Favourite Area " ;
        }
         return  "No matched rides found " ;
    }
}
