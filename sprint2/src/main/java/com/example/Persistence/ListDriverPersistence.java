package com.example.Persistence;

import java.util.*;

import com.example.Core.Driver;
import com.example.Core.Ride;
import com.example.others.FavouriteAreas;
import com.example.Persistence.ListRidePersistence;
public class ListDriverPersistence  implements DriverPersistence {


    List <Driver> drivers = new ArrayList<Driver>();
    List <FavouriteAreas> favAreas = new ArrayList<FavouriteAreas>(); 

    @Override
    public boolean add(Driver d) {
        return drivers.add(d);
    }

    @Override
    public List<Driver> getalldrivers() {
        return drivers;
    }

    @Override
    public Driver getdriver(String name) {
        for(int i =0 ; i<drivers.size();i++)
		  {
			  if(name.compareTo(drivers.get(i).getUserName())==0)
			       return drivers.get(i);
		  }
		return null;
    }

    @Override
    public boolean delete(String name) {
        for (Driver driver : drivers) {
            if(name.compareTo(driver.getUserName())==0) {
                return drivers.remove(driver);
            }
        }
        return false;
    }

    @Override
    public boolean update(Driver d, FavouriteAreas f) {
        return false;
    }
    

    @Override
    public List getPendingList()
    {
        List <Driver> Unverified = new ArrayList<Driver>();
        
        for (int i = 0 ;i<drivers.size();i++)
        {
            if(drivers.get(i).verified == 0)
            {
                
                Unverified.add(drivers.get(i));

            }

        }
        return Unverified;
    }

    @Override
    public List<Ride> getRides(String name) {

        return null; 
    }

    @Override
    public boolean login(String userName, String passWord) {
        for (int i = 0; i < drivers.size(); i++) {
            if (drivers.get(i).verified == 1) {
                if (userName.equals(drivers.get(i).getUserName())) {
                    if (passWord.compareTo(drivers.get(i).getPassWord())==0) {
                        System.out.println("Driver Login Successful");
                        return true;
                    } else {
                        System.out.println("Password Incorrect Login failed");
                    }
                } 
            }
            else {
                System.out.println("Account not verified");
            }
        }
        return false;
       
    }
    @Override
    public List<FavouriteAreas> getDFavArea(Driver d) {
        // for (Driver driver : drivers) {
        //     if(name.compareTo(driver.getUserName())==0) {
        //         return driver.getFavAreas();
        //     }
        // }
        return d.getFavAreas();
    }

    @Override
    public boolean addDriverFavArea(FavouriteAreas favArea) {
        return favAreas.add(favArea);
    }

    @Override
    public boolean getMatchedRides(Driver d,List<Ride> list,List<Driver> list2) {
        System.out.println(list.get(0));
    for (int i = 0; i < list.size(); i++) {
        for (int j = 0; j < list2.size(); j++) {
            if (list.get(i).getSource().equals(list2.get(j).getFavAreas().get(j).getName()))
            {
               d.update(list.get(i));
               
            }
        }
    }
    return true ;
    }

    @Override
    public boolean setBalance(Driver d, int balance) {
        d.setBalance(balance);
        return true;
    }
}
  
