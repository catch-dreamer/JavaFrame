package com.hk.web.action;

/**
 *@ClassName HelloAction
 *@Description struts入门
 *@Author HuangKun
 *@Date 2020/3/29 18:55
 *@Version 1.0
 **/
public class HelloAction {
    public String sayHello() {
        System.out.println("HelloAction的sayHello方法执行了");
        int i = 10 / 0;
        return "success";
    }
}
