package com.example.Persistence;

import java.util.ArrayList;
import java.util.List;

import com.example.Core.Passenger;

public class ListPassengerPersistence implements PassengerPersistence {
    public List <Passenger> passengers = new ArrayList<Passenger>();

    @Override
    public boolean add(Passenger p) {
        return passengers.add(p);
    }

    @Override
    public List getAllPassengers() {
        return passengers;
    }

    @Override
    public Passenger getPassenger(String name) {
        for(int i =0 ; i<passengers.size();i++)
		  {
			  if(name.compareTo(passengers.get(i).getUserName())==0)
			       return passengers.get(i);
		  }
		return null;
    }

    @Override
    public boolean delete(String name) {
        for (Passenger passenger : passengers) {
            if (passenger.getUserName().compareTo(name) == 0) {
                return passengers.remove(passenger);
            }
        }
        return false;
    }
    @Override
    public boolean login(String userName, String passWord) {
        for (int i = 0; i < passengers.size(); i++) {
                if (userName.equals(passengers.get(i).getUserName())) {
                    if (passWord.compareTo(passengers.get(i).getPassWord())==0) {
                        System.out.println("Passenger Login Successful");
                        passengers.get(i).loggedIn = true;
                        return true;
                    } else {
                        System.out.println("Password Incorrect Login failed");
                    }
                } 
            }
        return false;
    }
    
}

