package com.tao.ch2observer.weather;

import org.omg.CORBA.Object;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Oberver> oberverList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.oberverList = new ArrayList<>();
    }

    @Override
    public void addObserver(Oberver oberver) {
        oberverList.add(oberver);

    }

    @Override
    public void deleteObserver(Oberver oberver) {
        int index = oberverList.indexOf(oberver);
        if (index > 0 ) {
            oberverList.remove(index);
        }

    }

    @Override
    public void notifyObservers() {
        for (Oberver oberver : oberverList) {
            oberver.update(temperature, humidity, pressure);
        }
    }
}
