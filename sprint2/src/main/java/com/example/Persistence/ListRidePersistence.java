package com.example.Persistence;

import java.util.ArrayList;
import java.util.List;

import com.example.Core.Driver;
import com.example.Core.Ride;
import com.example.Observers.RideOffer;

public class ListRidePersistence implements RidePersistence {
    public List <Ride> Rides = new ArrayList<Ride>();
    public List <Ride> RidesHistory = new ArrayList<Ride>();
    
    public int getNextId() {
        return Rides.size();
   }

    @Override
    public boolean add(Ride ride) {
        return Rides.add(ride);
    }

    @Override
    public Ride get(int id) {
        for (Ride ride : Rides) {
            if (ride.getID() == id) {
                return ride;
            }
        }

        return null;
    }

    public Ride get(String name) {
        for (Ride ride : Rides) {
            if (ride.getRideRequester().username.equals(name)) {
                return ride;
            }
        }

        return null;
    }

    public Ride getbyDriver(String name) {
        for (Ride ride : Rides) {
            if (ride.getDriver().equals(name)) {
                return ride;
            }
        }

        return null;
    }
    
    @Override
    public List<Ride> getAll() {
        return Rides;
    }

    @Override
    public boolean delete(int id) {
        for (Ride ride : Rides) {
            if (ride.getID() == id) {
                return Rides.remove(ride);
            }
        }
        return false;
    }

    @Override
    public boolean EndRide(Ride r) {
        r.setEndRide(1);
        Rides.remove(r);
        RidesHistory.add(r);
        
        return true;
    }
    @Override
    public boolean RideRate(Ride r,int rate) {
        r.setRideRate(rate);
        return true;
    }

    @Override
    public boolean acceptRide(Ride r,int i) {
        r.setAcceptance(1);
        r.setDriver(r.getOffer().get(i).getOfferedBy().getUserName());
        r.setPrice(r.getOffer().get(i).getOffere());
        return true;
    }

    

    @Override
    public List<Ride> getRidesHistory(String name) {
        List<Ride> y = new ArrayList<Ride>();
        for (Ride ride : RidesHistory) {
            if (ride.getRideRequester().username.equals(name)) {
                y.add(ride);
            }
        }
        return y;
        
    }

    }

