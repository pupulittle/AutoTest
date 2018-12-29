package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author 戴娟
 * @date 2018/12/29 15:25
 * @desc
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void teacher1(){
        System.out.println("GroupOnClass3中的teacher11111运行");
    }

    public void teacher2(){
        System.out.println("GroupOnClass3中的teacher22222运行");
    }
}
