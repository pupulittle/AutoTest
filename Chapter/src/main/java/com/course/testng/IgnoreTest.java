package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author 戴娟
 * @date 2018/12/29 15:13
 * @desc
 */
public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignore1 执行！");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 执行！");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3 执行！");
    }
}
