package com.example.Services;

import java.util.List;

import com.example.Core.Passenger;
import com.example.Persistence.ListPassengerPersistence;

public interface IPassengerService {
    ListPassengerPersistence passengerRepo = new ListPassengerPersistence() ;
    public boolean add(Passenger p);
    public List getAllPassengers( );
    public Passenger getPassenger(String name);
    public boolean delete(String name);
    public boolean login(String userName,String passWord);
}
