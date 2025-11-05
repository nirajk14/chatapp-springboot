package com.nirajk14.chatapp;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    // listen to /app/chat (client sends here)
    @MessageMapping("/chat")
    // broadcast to /topic/messages (all subscribed clients receive this)
    @SendTo("/topic/messages")
    public ChatMessage send(ChatMessage message) {
        return message;
    }
}
