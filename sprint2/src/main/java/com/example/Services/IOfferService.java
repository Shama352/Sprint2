package com.example.Services;

import com.example.Core.Driver;
import com.example.Core.Ride;
import com.example.others.RideOffer;
import com.example.Persistence.ListRideOfferpersistence;

public interface IOfferService {
    ListRideOfferpersistence rideList  = new ListRideOfferpersistence();
   
    public boolean addoffer(RideOffer offer,Ride ride,Driver offerby);
    public boolean getoffer(int id);
}
