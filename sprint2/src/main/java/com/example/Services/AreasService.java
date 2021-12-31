package com.example.Services;

import java.util.List;

import com.example.Core.Driver;
import com.example.Observers.FavouriteAreas;

public class AreasService implements IAreasService {

    @Override
    public boolean add(FavouriteAreas f) {
        return favAreas.add(f);
    }

    @Override
    public List getAllLocations() {
        return favAreas.getAllAreas();
    }

    @Override
    public FavouriteAreas get(String areaName) {
        return favAreas.get(areaName);
    }

    @Override
    public List<Driver> getDriverFav(String name) {
        FavouriteAreas area = this.get(name);
		return  area.getdFavArea();
    }

    @Override
    public boolean update(FavouriteAreas area, Driver dname) {
        return favAreas.update(area, dname);
    }
    
}
