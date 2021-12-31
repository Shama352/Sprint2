package com.example.Persistence;

import java.util.List;

import com.example.Core.Driver;
import com.example.Core.Ride;
import com.example.Observers.FavouriteAreas;

public interface DriverPersistence {
    public boolean add(Driver d);
    public List getalldrivers( );
    public Driver getdriver(String name );
    public boolean delete(String name);
    public boolean update(Driver d, FavouriteAreas f); 
    public List getPendingList();
    public List<Ride> getRides(String name);
    public boolean login(String userName,String passWord);
    public boolean addDriverFavArea(FavouriteAreas dFavLocations);
    public List<FavouriteAreas> getDFavArea(Driver d);
    public boolean getMatchedRides(Driver d,List<Ride> list,List<Driver> list2);
}
