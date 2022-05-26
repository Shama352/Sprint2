package com.example.Controllers;

import java.util.List;

import com.example.Core.Driver;
import com.example.others.FavouriteAreas;
import com.example.Services.AreasService;
import com.example.Services.DriverService;
import com.example.Services.IAreasService;
import com.example.Services.IDriverService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AreasController {
    IAreasService aServ = new AreasService();
    IDriverService dServ = new DriverService();


    @PostMapping("/add/driver/{drivername}/favouriteAreas")
    public boolean add(@PathVariable String drivername, @RequestBody FavouriteAreas favArea) {	
        Driver d = dServ.getdriver(drivername);
	    d.addFavArea(favArea);
        return aServ.update(favArea,d);
    }
    

    @GetMapping("/driver/{username}/favouriteAreas")
    public List<FavouriteAreas> Get(@PathVariable String username)
    {
        Driver currentDriver = dServ.getdriver(username);
        // System.out.println(currentDriver.getFavAreas());
        return currentDriver.getFavAreas();
    }


}
