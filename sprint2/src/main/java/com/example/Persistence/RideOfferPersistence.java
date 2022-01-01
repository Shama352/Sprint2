package com.example.Persistence;

import com.example.Core.Driver;
import com.example.Core.Ride;
import com.example.others.RideOffer;

public interface RideOfferPersistence {
    public boolean addoffer(RideOffer offer,Ride ride,Driver Offerby);
    public boolean getoffer(int id);

}
