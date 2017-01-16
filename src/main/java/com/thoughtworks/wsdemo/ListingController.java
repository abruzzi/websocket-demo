package com.thoughtworks.wsdemo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ListingController {

    @MessageMapping("/listings")
    @SendTo("/topic/listings")
    public Listing handleMessage(Message message) {
        return new Listing(message.getTitle());
    }
}
