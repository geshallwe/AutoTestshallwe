package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1() {
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
        System.out.println("这是测试用例1");
    }
    @Test
    public void testCase2() {
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){

        System.out.println("这是在测试方法之前运行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("这是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("这是在类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("这是在类运行之后运行的方法");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件");
    }

}
