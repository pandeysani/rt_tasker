package com.example.rt_tasker.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class WebSocketBroadcaster {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    public void broadcast(String message) {
        messagingTemplate.convertAndSend("/topic/updates", new TaskNotification(message));
    }
}
