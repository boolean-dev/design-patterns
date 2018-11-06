package com.tao.ch2observer.java;

public class main {

    public static void main(String[] args) {

        //初始化weatherData
        WeatherData weatherData = new WeatherData();

        //将监听者注册到主题
        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisDisplay statisDisplay = new StatisDisplay(weatherData);

        //主题更新数据，进行推送
        weatherData.updateData(30,80,400);
        weatherData.updateData(40,90,500);
        weatherData.updateData(25,70,300);
    }


}
