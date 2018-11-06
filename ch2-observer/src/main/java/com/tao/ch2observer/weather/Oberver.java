package com.tao.ch2observer.weather;

/**
 * 观察者接口
 */
public interface Oberver {

    void update(float temperature, float humidity, float pressure);
}
