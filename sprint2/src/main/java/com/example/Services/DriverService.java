package com.example.Services;

import java.util.List;

import com.example.Core.Driver;
import com.example.Core.Ride;
import com.example.others.FavouriteAreas;

public class DriverService implements IDriverService {
    public boolean add(Driver d)
    {  
        return list.add(d);
    }
   
    public List getalldrivers( )
    {    
         return  list.getalldrivers();
    }
    
    public Driver getdriver(String name)
    {    
         return list.getdriver(name);
    }

   public boolean delete(String name) {
       return list.delete(name);
   }

   public boolean update(Driver d, FavouriteAreas f) {
       return list.update(d,f);
   }
   
   public List<Ride> getRides(String name) {
       return list.getRides(name);
   }

    @Override
    public List getPendingList() {
        return list.getPendingList();
    }

    @Override
    public boolean login(String userName, String passWord) {
        return list.login(userName, passWord);
    }
    @Override
    public List<FavouriteAreas> getDFavAreas(Driver d) {
         return list.getDFavArea(d);
    }

    @Override
    public boolean getMatchedRides(Driver d,List<Ride> lisst,List<Driver> list2) {
        return list.getMatchedRides(d,lisst,list2);
    }

    @Override
    public boolean setBalance(Driver d, int balance) {
        return list.setBalance(d, balance);
    }
}
