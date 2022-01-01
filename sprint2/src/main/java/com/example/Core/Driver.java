package com.example.Core;
import java.util.ArrayList;
import java.util.List;

import com.example.others.DriverObserver;
import com.example.others.FavouriteAreas;
import com.example.others.RideOffer;

public class Driver extends User implements DriverObserver
{
    public String licenseid;
    public String nationalid;
    public int verified;
    int balance;
    int offer;
    ArrayList<FavouriteAreas> favouriteAreas = new ArrayList<FavouriteAreas>();
    RideOffer p = new RideOffer();


    public Driver(String Type, String user, String mail, String pass, String mobile , String licenseid , String nationalid , int verified , int balance)
    {
        this.Type="d";
        this.verified=0;
        this.username=user;
        this.password=pass;
        this.email=mail;
        this.phone=mobile;
        this.licenseid=licenseid;
        this.nationalid=nationalid;
        this.balance=0;


    }
    public void setBalance(int balance)
    {
        this.balance=balance;
    }

    public int getBalance()
    {
        return this.balance;
    }
    public String getUserName()
    {
        return this.username;
    }
    public String getPassWord()
    {
        return this.password;
    }
    public ArrayList<FavouriteAreas> getFavAreas()
    {
        ArrayList<FavouriteAreas> x = new ArrayList<FavouriteAreas>();
        for(int i=0; i<this.favouriteAreas.size(); ++i){
            FavouriteAreas tempArea = new FavouriteAreas();
            tempArea.setName(this.favouriteAreas.get(i).getName());
            x.add(tempArea);
        }
        return x;
    }
    public void SetOffer( int offer)
    {
        this.offer=offer;
        p.PriceChanged();

    }
    public boolean addFavArea(FavouriteAreas FavArea)
    {
		return favouriteAreas.add(FavArea);	
	}
    @Override
    public String update(Ride r) {
        // for (FavouriteAreas i : favouriteAreas)
        // if (i.getName() == name) {
            System.out.println("There is a request from your Favourite Area From " +r.getSource() +" To "+ r.getDestination() +" With ride ID " +r.getID() );
            return "There is a request from your Favourite Area From " +r.getSource() +" To "+r.getDestination() +" With ride ID " +r.getID() ;
       // }
    }

        
}