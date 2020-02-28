package com.springbootnew.demo.controller;

public class ProgectController {

    private int id;
    private String fullName;
    private String description;
    private int creatorId;
    private UserController[] activeUsers;

    public ProgectController(int id, String fullName, String description, int creatorId, UserController[] activeUsers) {
        this.id = id;
        this.fullName = fullName;
        this.description = description;
        this.creatorId = creatorId;
        this.activeUsers = activeUsers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    public UserController[] getActiveUsers() {
        return activeUsers;
    }

    public void setActiveUsers(UserController[] activeUsers) {
        this.activeUsers = activeUsers;
    }
}
