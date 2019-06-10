package com.tao.patterns.ch11proxy.handler;

import com.tao.patterns.ch11proxy.entity.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName OwnerInvocationHandler
 * @Descriiption 拥有权限的代理处理器
 * @Author yanjiantao
 * @Date 2019/6/10 10:39
 **/
public class OwnerInvocationHandler implements InvocationHandler {

    private Person person;

    public OwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().startsWith("get")) {
            return method.invoke(person, args);
        }else if ("setHotRating".equals(method.getName())) {
            throw new IllegalAccessException();
        }else if (method.getName().startsWith("set")) {
            return method.invoke(person, args);
        }
        return null;
    }
}
