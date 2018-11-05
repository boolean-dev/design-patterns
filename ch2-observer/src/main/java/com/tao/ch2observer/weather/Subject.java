package com.tao.ch2observer.weather;

public interface Subject {

    void addObserver(Oberver oberver);
    void deleteObserver(Oberver oberver);
    void notifyObservers();
}
