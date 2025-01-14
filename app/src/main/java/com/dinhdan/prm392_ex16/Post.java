package com.dinhdan.prm392_ex16;

public class Post {
    private int id;
    private String title;
    private String body;
    public Post(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
}