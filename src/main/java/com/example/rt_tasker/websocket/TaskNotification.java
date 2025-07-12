package com.example.rt_tasker.websocket;

public class TaskNotification {
    private String message;

    public TaskNotification() {}
    public TaskNotification(String message) { this.message = message; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}