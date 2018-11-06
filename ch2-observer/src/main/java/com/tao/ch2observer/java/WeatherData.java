package com.tao.ch2observer.java;

import com.tao.ch2observer.weather.Oberver;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * 主题
 * 天气预报数据中心
 */
public class WeatherData extends Observable {

//    private List<Oberver> oberverList;
    private float temperature;
    private float humidity;
    private float pressure;

    /*public WeatherData() {
        this.oberverList = new ArrayList<>();
    }*/

    /**
     * 更新完天气数据之后，通知监听者更新数据
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void updateData(float temperature,float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        super.notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
