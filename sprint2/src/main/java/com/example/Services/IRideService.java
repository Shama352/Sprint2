package com.example.Services;

import java.util.List;

import com.example.Core.Ride;
import com.example.Persistence.ListRidePersistence;
import com.example.Persistence.RidePersistence;

public interface IRideService {
    RidePersistence persistence = new ListRidePersistence();
    boolean add(Ride person);
    Ride get(String name);
    Ride get(int id);
    List<Ride> getAll();
    boolean delete(int id);
    boolean EndRide(Ride r);
    boolean RideRate(Ride r,int rate);
    Ride getbyDriver(String name);
    boolean acceptRide(Ride r,int i);
    List<Ride> getRidesHistory(String name);
}
