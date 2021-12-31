package com.example.Persistence;

import java.util.List;

import com.example.Core.Driver;
import com.example.Observers.FavouriteAreas;

public interface FavouriteAreasPersistence {
    public boolean add (FavouriteAreas area);
	public List<FavouriteAreas> getAllAreas();
	public FavouriteAreas get(String areaName);
	public List<Driver> getDrivers(String driverName);
}
