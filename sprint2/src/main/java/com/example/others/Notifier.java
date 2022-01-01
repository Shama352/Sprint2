package com.example.others;

public interface Notifier{
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public  void notifyObservers();
}
