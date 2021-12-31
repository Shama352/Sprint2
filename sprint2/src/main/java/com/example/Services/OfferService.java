package com.example.Services;

import com.example.Core.Driver;
import com.example.Core.Ride;
import com.example.Observers.RideOffer;

public class OfferService implements IOfferService {

    @Override
    public boolean addoffer(RideOffer offer, Ride rideID,Driver offerby) {
        return rideList.addoffer(offer, rideID,offerby);
    }

    @Override
    public boolean getoffer(int id) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
