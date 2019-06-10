package com.tao.patterns.ch11proxy.handler;

import com.tao.patterns.ch11proxy.entity.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName NonOwnerInvocationHandler
 * @Descriiption 没有权限的代理处理器
 * @Author yanjiantao
 * @Date 2019/6/10 10:58
 **/
public class NonInvocationHandler implements InvocationHandler {

    private Person person;

    public NonInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")) {
            return method.invoke(person, args);
        }else if ("setHotRating".equals(method.getName())) {
            return method.invoke(person, args);
        }else if (method.getName().startsWith("set")) {
            throw new IllegalAccessException();
        }
        return null;
    }
}
