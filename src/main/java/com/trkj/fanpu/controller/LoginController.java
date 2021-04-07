package com.trkj.fanpu.controller;

import com.trkj.fanpu.utils.Response;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginController {

    //登录  未授权 暂无与数据库连接
    @PostMapping("login")
    public Response login(){
        System.out.println("ssss");
        return Response.ok().data("token","admin");
    }

    @GetMapping("info")
    public Response getinfo(){

        return Response.ok().data("roles","[admin]")
                .data("name","admin")
                .data("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }

    @PostMapping("logout")
    public Response logout(){
        return Response.ok();
    }
}

