package com.tao.ch2observer.weather;

import org.omg.CORBA.Object;

import java.util.List;

public class WeatherData implements Subject {

    private List<Oberver> oberverList;
    private float temperature;
    private float humidity;
    private  float pressure;


    @Override
    public void addObserver(Oberver oberver) {

    }

    @Override
    public void deleteObserver(Oberver oberver) {

    }

    @Override
    public void notifyObservers() {

    }
}
