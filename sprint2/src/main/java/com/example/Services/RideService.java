package com.example.Services;

import java.util.List;

import com.example.Core.Ride;

public class RideService implements IRideService {

    @Override
    public boolean add(Ride ride) {
        ride.setID(persistence.getNextId());
        return persistence.add(ride);
    }

    @Override
    public Ride get(int id) {
        return persistence.get(id);
    }

    @Override
    public List<Ride> getAll() {
        return persistence.getAll();
    }


    @Override
    public boolean delete(int id) {
        return persistence.delete(id);
    }

    @Override
    public Ride get(String name) { 
        return persistence.get(name);
    }

    @Override
    public boolean EndRide(Ride r) {
         return persistence.EndRide(r);
    }

    @Override
    public boolean RideRate(Ride r, int rate) {
       return  persistence.RideRate(r, rate);
    }

    @Override
    public Ride getbyDriver(String name) {
        return persistence.getbyDriver(name);
    }

    public boolean acceptRide(Ride r,int i)
    {
        return persistence.acceptRide(r, i);
    }

    @Override
    public List<Ride> getRidesHistory(String name) {
        return persistence.getRidesHistory(name);
    }
    
    
}
