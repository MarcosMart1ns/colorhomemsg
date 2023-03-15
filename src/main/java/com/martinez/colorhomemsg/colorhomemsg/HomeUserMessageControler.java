package com.martinez.colorhomemsg.colorhomemsg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeUserMessageControler {

    @Autowired
    Message message;

    @GetMapping("/")
    public String getHomeMessage(){
        return message.getMessage();
    }
}
