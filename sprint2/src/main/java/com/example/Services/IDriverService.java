package com.example.Services;

import java.util.List;

import com.example.Core.*;
import com.example.Observers.FavouriteAreas;
import com.example.Persistence.DriverPersistence;
import com.example.Persistence.ListDriverPersistence;

public interface IDriverService {
    ListDriverPersistence list = new ListDriverPersistence() ;
	
    public boolean add(Driver d);
    public List getalldrivers( );
    public Driver getdriver(String name);
    public boolean delete (String name);
    public boolean update (Driver d ,FavouriteAreas f);
    public List getPendingList();
    public List<Ride> getRides(String name);
    public boolean login(String userName,String passWord);
    public List<FavouriteAreas> getDFavAreas(Driver d);
    public boolean getMatchedRides(Driver d, List<Ride> list, List<Driver> list2);
    public boolean setBalance(Driver d,int balance);
}
