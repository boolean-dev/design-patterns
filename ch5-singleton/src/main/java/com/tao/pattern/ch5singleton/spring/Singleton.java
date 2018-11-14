package com.tao.pattern.ch5singleton.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Singleton  implements BeanFactoryAware, BeanNameAware,InitializingBean, DisposableBean {
    private String name;

    public Singleton() {
        System.out.println("初始化构造方法...");
    }

    public void print(){
        System.out.println("单例模式 name=" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory" + beanFactory.toString());
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName" + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}
