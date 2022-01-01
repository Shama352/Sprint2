package com.example.Core;

import com.example.others.Observer;

public class Passenger extends User implements Observer  {
    public Passenger(String Type ,String user, String mail, String pass, String mobile)
    {
        this.Type="p";
        this.username=user;
        this.password=pass;
        this.email=mail;
        this.phone=mobile;
        this.loggedIn=false;
    }
    public String getUserName()
    {
        return this.username;
    }

    @Override
    public void update(int offer) {
        System.out.println("Driver's offer is " + offer );
    }
    public String getPassWord() {
        return this.password;
    }

}
