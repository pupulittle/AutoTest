package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @author 戴娟
 * @date 2018/12/29 14:58
 * @desc
 */
public class SuiteConfig {

    @BeforeSuite
    public  void beforeSuite(){
        System.out.println("beforeSuite运行啦");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite运行啦");
    }

    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeTest");
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("AfterTest");
    }
}
