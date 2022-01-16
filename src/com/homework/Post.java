package com.homework;

import java.time.LocalDateTime;

public class Post {
    private String content;
    private String description;
    private Comment[] comments;
    private Integer likeNumber;
    private LocalDateTime time;

    public Post() {
    }

    public Post(String content, String description, Comment[] comments, Integer likeNumber, LocalDateTime time) {
        this.content = content;
        this.description = description;
        this.comments = comments;
        this.likeNumber = likeNumber;
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }

    public Integer getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(Integer likeNumber) {
        this.likeNumber = likeNumber;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
