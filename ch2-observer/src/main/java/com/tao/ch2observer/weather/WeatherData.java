package com.tao.ch2observer.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题
 * 天气预报数据中心
 */
public class WeatherData implements Subject {

    private List<Oberver> oberverList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.oberverList = new ArrayList<>();
    }

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
        this.notifyObservers();
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
