package com.example.Core;
import java.util.ArrayList;
import java.util.List;

import com.example.Observers.RideOffer;

public class Ride {
    String source;
    String destination;
    int id;
    int EndRide;
    int RideRate;
    int acceptance;
    int price;
    String Driver;
    Passenger rideRequester;
    Driver offeredBy ;
    List<RideOffer> rideOffer = new ArrayList<RideOffer>();
    List<Integer> Offers = new ArrayList<Integer>();

    public Ride(int EndRide , int RideRate , String Driver,int acceptance,int price)
    {
            this.EndRide = 0;
            this.RideRate = 0;
            this.acceptance= 0;
            this.price = 0;
            this.Driver = null;
    }

    public void setEndRide(int EndRide)
    {
        this.EndRide = EndRide;
    }

    public void setRideRate(int RideRate)
    {
        this.RideRate = RideRate;
    }

    public void setDriver(String Driver)
    {
        this.Driver = Driver;
    }
    public void setAcceptance(int acceptance)
    {
        this.acceptance = acceptance;
    }

    public int getAcceptance()
    {
        return acceptance;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }

    public int getEndRide()
    {
        return EndRide;
    }
    
    public int getRideRate()
    {
        return RideRate;
    }

    public String getDriver()
    {
        return Driver;
    }
    public Passenger getRideRequester() {
		return rideRequester;
	}

	public void setRideRequester(Passenger rideRequester) {
		this.rideRequester = rideRequester;
	}
    
	public void setRideOfferedBy(Driver offeredBy) {
		this.offeredBy = offeredBy;
	}
    public void setRideOffer(RideOffer rideOffer) {
		this.rideOffer.add(rideOffer) ;
	}
    public List<RideOffer> getOffer() {
		return rideOffer;
	}
    public Ride() {

    }
    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void requestrides(String source, String destination)
    {
        this.source=source;
        this.destination=destination;
        System.out.println("Ride requested from " + source +  " to " + destination);

    }
}
