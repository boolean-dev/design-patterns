package com.tao.ch2observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * 气压预报
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private float lastPressure = 400f;
    private float pressure;

    private WeatherData weatherData;

    public ForecastDisplay() {
    }

    /**
     * 注册该监听者到主题
     * @param weatherData
     */
    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        if (lastPressure > pressure) {
            System.out.println("起亚变低了\n\n");
        }else if(lastPressure < pressure) {
            System.out.println("气压变高了\n\n");
        }else {
            System.out.println("气压不发生改变\n\n");
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
