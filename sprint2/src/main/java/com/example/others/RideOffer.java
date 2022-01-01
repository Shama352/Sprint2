package com.example.others;

import java.util.ArrayList;

import com.example.Core.Driver;

public class RideOffer implements Notifier {
    int offer;
    Driver Offerby;
    ArrayList observers = new ArrayList();

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }
    public void setOfferedBy(Driver offerBy) {
		this.Offerby = offerBy;
	}
    public Driver getOfferedBy() {
		return this.Offerby;
	}
    public void setOffer(int offer) {
		this.offer = offer;
	}
    public int getOffere() {
		return offer;
	}
    public void notifyObservers() {
        int i=0;
        Observer observer = (Observer) observers.get(i);
        observer.update(offer);
        i++;

    }
    public void PriceChanged() {
        notifyObservers();
    }
    // public void SetOffer( int offer)
    // {
    //     this.offer=offer;
    //     PriceChanged();
    // }
}
