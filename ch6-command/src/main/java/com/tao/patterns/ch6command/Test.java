package com.tao.patterns.ch6command;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {


    public static void main(String[] args) {
        Test test  = new Test();
        test.fun1();
    }


    public void fun1() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("111");
        list1.add("222");
        list1.add("333");
        list1.add("444");

        list2.add("444");
        list2.add("555");

        List<String> bing  = list1.stream().filter(list -> list2.contains(list)).collect(Collectors.toList());

        list2.removeAll(bing);

        list1.addAll(list2);

        System.out.println("aaa");

        /*for (int i = 0; i < list2.size(); i++) {
            if (list1.contains(list2.get(i))) {

            }
        }*/

    }
}
