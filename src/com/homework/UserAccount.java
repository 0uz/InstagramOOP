package com.homework;

public class UserAccount extends Account{
    private String accountName;

    public UserAccount(Integer userId, String password, String description, String profileImage, int numberOfFollowers, int numberOfFollowings, Story[] stories, Post[] posts, String accountName) {
        super(userId, password, description, profileImage, numberOfFollowers, numberOfFollowings, stories, posts);
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
