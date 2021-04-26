package com.example.LAB7.Entities;

public class Posts {
    private int id;
    private int user_id;
    private String title;
    private String content;
    private int likes;
    private int dislikes;

    public int getId() {
        return id;
    }

    public Posts(int id, int user_id, String title, String content, int likes, int dislikes) {
        this.id = id;
        this.user_id = user_id;
        this.title = title;
        this.content = content;
        this.likes = likes;
        this.dislikes = dislikes;
    }
    public Posts() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }
}
