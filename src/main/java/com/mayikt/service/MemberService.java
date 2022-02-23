package com.mayikt.service;

import com.netflix.loadbalancer.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberService {
    @Value("${server.port}")
    private String serverPort;
    @RequestMapping("/getUser")
    public String getUser(){
        return "梅特教育"+serverPort;
    }
}
