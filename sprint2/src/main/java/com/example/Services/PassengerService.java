package com.example.Services;

import java.util.List;

import com.example.Core.Passenger;

public class PassengerService implements IPassengerService {

    @Override
    public boolean add(Passenger p) {
        return passengerRepo.add(p);
    }

    @Override
    public List getAllPassengers() {
        return passengerRepo.getAllPassengers();
    }

    @Override
    public Passenger getPassenger(String name) {
        return passengerRepo.getPassenger(name);
    }

    @Override
    public boolean delete(String name) {
        return passengerRepo.delete(name);
    }
    @Override
    public boolean login(String userName, String passWord) {
        return passengerRepo.login(userName, passWord);
    }
    
}
