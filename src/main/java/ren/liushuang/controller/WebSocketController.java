package ren.liushuang.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liushuang on 22/7/2016.
 */
@Controller
public class WebSocketController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public String say(String name) {
        return "welcome" + name;
    }

    @RequestMapping("ws")
    public String wsTest(){
        return "ws";
    }
}
