package com.tao.pattern.ch5singleton.loadbalance;

import java.util.ArrayList;
import java.util.List;

public class LoadBalancer {

    private static LoadBalancer instance = null;
    List<String> serverList = new ArrayList<>();

    private LoadBalancer() {

    }

    public static LoadBalancer getInstance(){
        if (instance == null) {
            System.out.println("初始化单例...");
            instance  = new LoadBalancer();
            return instance;
        } else {
            return instance;
        }
    }

    public void addServer(String name) {
        serverList.add(name);
    }

    public void delServer(String name) {
        serverList.remove(name);
    }

    public List<String> getServerList() {
        return serverList;
    }
}
