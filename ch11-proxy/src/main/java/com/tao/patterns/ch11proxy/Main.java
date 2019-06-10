package com.tao.patterns.ch11proxy;

import com.tao.patterns.ch11proxy.entity.Person;
import com.tao.patterns.ch11proxy.entity.PersonImpl;
import com.tao.patterns.ch11proxy.handler.NonInvocationHandler;
import com.tao.patterns.ch11proxy.handler.OwnerInvocationHandler;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Main
 * @Descriiption 代理模式测试类
 * @Author yanjiantao
 * @Date 2019/6/10 11:01
 **/
public class Main {

    Map<String, Person> data = new HashMap<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        Person zhangsan = data.get("zhangsan");
        Person ownerProxy = this.getOwnerProxy(zhangsan);
        System.out.println("--------->name=" + ownerProxy.getName());
        ownerProxy.setName("zhangsan111");
        System.out.println("update--------->name=" + ownerProxy.getName());
        System.out.println("---------->hotRating=" + ownerProxy.getHotRating());
        try {
            ownerProxy.setHotRating(20);
        } catch (Exception e) {
            System.out.println("角色不能设置评价");
        }
        System.out.println("update---------->hotRating=" + ownerProxy.getHotRating());



        Person nonProxy = this.getNonProxy(zhangsan);
        System.out.println("--------->name=" + nonProxy.getName());
        try {
            nonProxy.setName("zhangsan111");
        } catch (Exception e) {
            System.out.println("角色不能名字");
        }
        System.out.println("update--------->name=" + nonProxy.getName());
        System.out.println("---------->hotRating=" + nonProxy.getHotRating());
        nonProxy.setHotRating(20);
        System.out.println("update---------->hotRating=" + nonProxy.getHotRating());
    }

    private Person getOwnerProxy(Person person) {

        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    /**
     * 得到未授权的代理处理器
     * @param person person
     * @return 处理器
     */
    private Person getNonProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonInvocationHandler(person));
    }

    /**
     * 构造函数
     */
    private Main() {
        this.initData();
    }

    /**
     * 初始化数据
     */
    private void initData() {
        Person zhangsan = new PersonImpl();
        zhangsan.setName("zhangsan");
        zhangsan.setGender("nan");
        zhangsan.setInterests("book,music");
        zhangsan.setHotRating(10);

        Person zhansi = new PersonImpl();
        zhansi.setName("zhansi");
        zhansi.setGender("nv");
        zhansi.setInterests("code,book");
        zhansi.setHotRating(15);

        data.put(zhangsan.getName(), zhangsan);
        data.put(zhansi.getName(), zhansi);
    }
}
