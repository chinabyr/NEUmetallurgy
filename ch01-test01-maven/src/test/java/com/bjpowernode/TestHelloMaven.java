package com.bjpowernode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHelloMaven {
    @Test
    public void testAdd(){
        System.out.println("=====testAdd 测试add方法");
        HelloMaven helloMaven = new HelloMaven();
        int res = helloMaven.add(10,20);
        Assertions.assertEquals(30,res);
    }
    @Test
    public void test2(){
        System.out.println("===testAdd 测试add方法");
        HelloMaven helloMaven = new HelloMaven();
        int res = helloMaven.add(10,20);
        Assertions.assertEquals(30,res);
    }
}
