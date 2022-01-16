package com.homework;

public class Comment {
    private Integer commentID;
    private String content;

    public Comment(Integer commentID, String content) {
        this.commentID = commentID;
        this.content = content;
    }

    public Integer getCommentID() {

        return commentID;
    }

    public void setCommentID(Integer commentID) {
        this.commentID = commentID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
