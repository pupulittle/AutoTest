package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author 戴娟
 * @date 2018/12/29 15:44
 * @desc
 */
public class DependTest {

    /**
     * test2依赖于test1方法
     * 运行test2时会先运行test1，再运行test2。如果test1运行失败后，就不会运行test2
     * 因此可以将test2需要的前置条件写入test1中
     */
    @Test
    public void test1(){
        System.out.println("test1 run");
        //throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
