package com.tao.ch2observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * 温度统计接口
 */
public class StatisDisplay implements Observer, DisplayElement {

    private float maxTemper = 38.0f;
    private float minTemper = 25.0f;
    private float sumTemper = 100.0f;
    private float avgTemper = 0.0f;
    private float currTemper;
    private int count = 3;

    private WeatherData weatherData;

    public StatisDisplay() {
    }

    /**
     * 注册监听者到主题
     * @param weatherData
     */
    public StatisDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("温度统计:\n当前温度:" + currTemper + "\n最高温度:" + maxTemper + "\n最低温度:" + minTemper + "\n平均温度" + avgTemper);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            currTemper = weatherData.getTemperature();

            avgTemper = (sumTemper+weatherData.getTemperature()) / ++count;

            if (weatherData.getTemperature() > maxTemper) {
                maxTemper = weatherData.getTemperature();
            }

            if (weatherData.getTemperature() < minTemper) {
                minTemper = weatherData.getTemperature();
            }

            display();
        }
    }
}
