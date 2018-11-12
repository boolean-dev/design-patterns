package com.tao.pattern.ch5singleton.loadbalance;

public class main {

    public static void main(String[] args) {
        LoadBalancer loadBalancer1 = LoadBalancer.getInstance();
        loadBalancer1.addServer("server1");
        loadBalancer1.addServer("server2");

        LoadBalancer loadBalancer2 = LoadBalancer.getInstance();

        loadBalancer2.getServerList().forEach(System.out::println);

        loadBalancer2.delServer("server1");
        loadBalancer1.getServerList().forEach(System.out::println);
    }
}
