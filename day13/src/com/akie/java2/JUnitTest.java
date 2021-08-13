package com.akie.java2;

import org.testng.annotations.Test;

import java.util.Date;

/*
* Java中的JUnit单元测试
*
* 步骤：
*
*
* */
public class JUnitTest {

    @Test
    public void testEquals(){
        String s1 = "MM";
        String s2 = "MM";
        System.out.println(s1.equals(s2));
    }
}
