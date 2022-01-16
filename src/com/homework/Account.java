package com.homework;

public class Account {
    private Integer userId;
    private String password;
    private String description;
    private String profileImage;
    private int numberOfFollowers;
    private int numberOfFollowings;
    private Story[] stories;
    private Post[] posts;

    public Account() {
    }


    public Account(Integer userId, String password, String description, String profileImage, int numberOfFollowers, int numberOfFollowings, Story[] stories, Post[] posts) {
        this.userId = userId;
        this.password = password;
        this.description = description;
        this.profileImage = profileImage;
        this.numberOfFollowers = numberOfFollowers;
        this.numberOfFollowings = numberOfFollowings;
        this.stories = stories;
        this.posts = posts;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public int getNumberOfFollowings() {
        return numberOfFollowings;
    }

    public void setNumberOfFollowers(int numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

    public void setNumberOfFollowings(int numberOfFollowings) {
        this.numberOfFollowings = numberOfFollowings;
    }

    public Story[] getStories() {
        return stories;
    }

    public void setStories(Story[] stories) {
        this.stories = stories;
    }

    public Post[] getPosts() {
        return posts;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }

}
