package com.example.email_project;

public class Email {
    private String title, content,time,word;

    public Email(String title, String content, String time) {
        this.title = title;
        this.content = content;
        this.time = time;
        this.word = title.substring(0,1).toUpperCase();
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWord() {
        return word;
    }

}
