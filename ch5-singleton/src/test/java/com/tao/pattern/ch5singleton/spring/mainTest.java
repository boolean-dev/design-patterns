package com.tao.pattern.ch5singleton.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class mainTest {

    @Autowired
    private Bean1 bean1;
    @Autowired
    private Bean2 bean2;
    @Autowired
    private Bean3 bean3;

    @Test
    public void test() {
        bean1.print();
        bean2.print();
        bean3.print();
    }

}