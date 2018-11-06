package com.tao.ch2observer.weather;

/**
 * 主题接口
 */
public interface Subject {

    void addObserver(Oberver oberver);
    void deleteObserver(Oberver oberver);
    void notifyObservers();
}
