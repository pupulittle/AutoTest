package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author 戴娟
 * @date 2018/12/29 15:24
 * @desc
 */
@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("GroupOnClass1中的stu11111运行");
    }

    public void stu2(){
        System.out.println("GroupOnClass1中的stu22222运行");
    }
}
