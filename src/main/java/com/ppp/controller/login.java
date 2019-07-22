package com.ppp.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ppp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user/")
public class login {
    @Autowired
    private User user;

    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ResponseBody
    public JSON login(User u){
        System.out.println(123);
        System.out.println(u);
        JSONObject o = (JSONObject)JSON.toJSON(u);
        return o;
    }

}
