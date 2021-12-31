package com.example.Observers;

import com.example.Core.Driver;

public interface FavouriteAreasSubject {
    public void registerObserver(Driver d);
    public void removeObserver(Driver d);
    public void notifyObservers();
}
