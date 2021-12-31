package com.example.Observers;

import java.util.ArrayList;
import java.util.List;

import com.example.Core.Driver;

public class FavouriteAreas implements FavouriteAreasSubject {
    private String name;
    List<Driver> drivers = new ArrayList<Driver>() ;

    public FavouriteAreas()
    {
        this.name=name;
        this.drivers= new ArrayList<Driver>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setdFavArea(List<Driver> dFavArea) 
	{
		this.drivers = dFavArea;
	}	
	public List<Driver> getdFavArea()
	{
		return drivers;
	}
    public void notifyObservers() {
        for (Driver d : drivers) {
           //d.update(this.name);
        }
    }


    public void registerObserver(Driver d) {
        drivers.add(d);
    }


    public void removeObserver(Driver d) {
        int i = drivers.indexOf(d);
        if (i >= 0) {
            drivers.remove(i);
        }
    }

}
    
