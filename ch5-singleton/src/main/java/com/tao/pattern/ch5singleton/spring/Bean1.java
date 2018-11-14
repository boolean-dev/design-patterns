package com.tao.pattern.ch5singleton.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bean1 {

    @Autowired
    private Singleton singleton;

    public void print(){
        singleton.setName("1");
        singleton.print();
    }
}
