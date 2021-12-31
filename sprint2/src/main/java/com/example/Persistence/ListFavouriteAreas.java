package com.example.Persistence;

import java.util.ArrayList;
import java.util.List;

import com.example.Core.Driver;
import com.example.Observers.FavouriteAreas;
import com.example.Persistence.ListDriverPersistence;

import org.springframework.http.converter.xml.SourceHttpMessageConverter;
public class ListFavouriteAreas implements FavouriteAreasPersistence{
private static List<FavouriteAreas> favAreas = new ArrayList<FavouriteAreas>();
	@Override
	public boolean add(FavouriteAreas area) {
        if (favAreas.contains(area))
        {
            return true;
        }
		return favAreas.add(area);
	}

	@Override
	public List<FavouriteAreas> getAllAreas() {
		return favAreas;
	}

	@Override
	public FavouriteAreas get(String areaName) {
		 for (FavouriteAreas area : favAreas) {
	            if (area.getName().compareTo(areaName)==0) {
	                return area;
	            }
	        }
          return null;
	}

	@Override
	public List<Driver> getDrivers(String driverName) {
		FavouriteAreas dLocation = this.get(driverName);
		return  dLocation.getdFavArea();
	}
	
	public boolean update(FavouriteAreas area , Driver d)
	{
            if (favAreas.contains(area))
            {
                    area.registerObserver(d);
                    return true;
            }
            favAreas.add(area);
            area.registerObserver(d);
            return true;
	}

}

