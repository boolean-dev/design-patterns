package com.tao.ch2observer.weather;

/**
 * 实时天气预报展示牌
 */
public class CurrentDisplay implements Oberver, DisplayElement {

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
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
