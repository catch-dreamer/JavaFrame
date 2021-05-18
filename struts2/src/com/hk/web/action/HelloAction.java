package com.hk.web.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 *@ClassName HelloAction
 *@Description struts入门
 *@Author HuangKun
 *@Date 2020/3/29 18:55
 *@Version 1.0
 **/
public class HelloAction extends ActionSupport {
    public String sayHello() {
        System.out.println("HelloAction的sayHello方法执行了");
        //int i = 10 / 0;
        return "success";
    }
}
