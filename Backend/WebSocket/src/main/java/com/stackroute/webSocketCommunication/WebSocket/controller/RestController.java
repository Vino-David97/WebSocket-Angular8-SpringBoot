package com.stackroute.webSocketCommunication.WebSocket.controller;

import com.stackroute.webSocketCommunication.WebSocket.model.Hello;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.core.MessagePostProcessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.HtmlUtils;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
    @Autowired
    private SimpMessagingTemplate template;

    private static final Logger logger = LoggerFactory.getLogger(RestController.class);

    @GetMapping("/change")
    public void greeting() throws Exception{
        this.template.convertAndSend("/topic/hi", new Hello("Hello, " + HtmlUtils.htmlEscape("Vino David - State changed") + "!"), new MessagePostProcessor() {
            @Override
            public Message<?> postProcessMessage(Message<?> message) {
                byte[] byteStr= message.getPayload().toString().getBytes();
                String smg = new String(byteStr);
                return message;
            }
        });


    }
}
