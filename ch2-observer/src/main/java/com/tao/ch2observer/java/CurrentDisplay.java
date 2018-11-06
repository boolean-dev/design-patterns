package com.tao.ch2observer.java;


import java.util.Observable;
import java.util.Observer;

/**
 * 实时天气预报展示牌
 */
public class CurrentDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;

    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentDisplay() {
    }

    /**
     * 构造方法注册到主题
     * @param weatherData
     */
    public CurrentDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("实时天气预报:\n温度：" + temperature + "\n湿度:" + humidity + "\n气压" + pressure + "\n\n" );
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
//        this.temperature = temperature;
//        this.humidity = humidity;
//        this.pressure = pressure;

    }
}
