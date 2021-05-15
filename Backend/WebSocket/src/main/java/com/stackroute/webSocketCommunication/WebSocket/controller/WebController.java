package com.stackroute.webSocketCommunication.WebSocket.controller;


import com.stackroute.webSocketCommunication.WebSocket.model.Hello;
import com.stackroute.webSocketCommunication.WebSocket.model.User;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;


@Controller
public class WebController {

    @MessageMapping("/hello")
    @SendTo("/topic/hi")
    public Hello greeting(User user) throws Exception {
        return new Hello("Hi, " + user.getName() + "!");
    }
}
