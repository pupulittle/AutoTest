package com.course.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author 戴娟
 * @date 2018/12/29 15:56
 * @desc
 */
public class ParameterTest {
    /**
     *
     * 通过xml来获取参数
     */
    @Test
    @Parameters({"name","age"})
    public void parameterTest(String name,int age){
        System.out.println("name = " + name + "  " + "age = " + age);
    }
}
