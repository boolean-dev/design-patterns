package com.tao.ch2observer.java;

/**
 * 气压预报
 */
public class ForecastDisplay implements Oberver, DisplayElement {

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
            System.out.println("天气将更加下雨了，请注意收被子\n\n");
        }else if(lastPressure < pressure) {
            System.out.println("天气将更热，请注意中暑\n\n");
        }else {
            System.out.println("天气将不发生改变\n\n");
        }
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }
}
