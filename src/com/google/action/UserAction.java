package com.google.action;

import com.google.*;
import com.google.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.ApplicationContext;

/**
 * Created by 王炳智 on 2017/8/22.
 */
public class UserAction extends ActionSupport{
    @Override
    public String execute() throws Exception {
        System.out.println("action...........");
       ApplicationContext ctx = new ApplicationContext("bean1.xml");
       UserService userService = (UserService) ctx.getBean("userService");
       userService.add();
        return NONE;
    }
}
