package com.example.Persistence;

import java.util.List;

import com.example.Core.Ride;
import com.example.Observers.RideOffer;

public interface RidePersistence {
    public int getNextId();
    boolean add(Ride ride);
    Ride get(int id);
    Ride get(String name);
    List<Ride> getAll();
    boolean delete(int id);
    boolean EndRide(Ride r);
    boolean RideRate(Ride r,int rate);
    Ride getbyDriver(String name);
    boolean acceptRide(Ride r,int i);
    List<Ride> getRidesHistory(String name);
    Ride getHistory(int id);
}
