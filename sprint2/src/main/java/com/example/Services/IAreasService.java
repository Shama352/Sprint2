package com.example.Services;

import java.util.List;

import com.example.Core.Driver;
import com.example.others.FavouriteAreas;
import com.example.Persistence.ListFavouriteAreas;

public interface IAreasService {
    ListFavouriteAreas favAreas  = new ListFavouriteAreas();

	
    public boolean add(FavouriteAreas d);
    public List getAllLocations();
    public FavouriteAreas get(String areaName);
    public List<Driver> getDriverFav(String name);
    public boolean update(FavouriteAreas fav, Driver dname);
}
