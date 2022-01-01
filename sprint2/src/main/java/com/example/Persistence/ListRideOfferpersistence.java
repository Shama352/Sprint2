package com.example.Persistence;

import java.util.ArrayList;
import java.util.List;

import com.example.Core.Driver;
import com.example.Core.Ride;
import com.example.others.RideOffer;

public class ListRideOfferpersistence implements RideOfferPersistence {
    List <RideOffer> offers = new ArrayList<RideOffer>();
    @Override
    public boolean addoffer(RideOffer offer,Ride ride,Driver offerby) {
        offers.add(offer);
        ride.setRideOffer(offer);
        offer.setOfferedBy(offerby);
        return true;
    }

    @Override
    public boolean getoffer(int id) {
        
        return true;
    }
    
}
