package com.example.Persistence;

import java.util.List;

import com.example.Core.Passenger;

public interface PassengerPersistence {
    public boolean add(Passenger p);
    public List getAllPassengers( );
    public Passenger getPassenger(String name);
    public boolean delete(String name);
    public boolean login(String userName, String passWord);
}
