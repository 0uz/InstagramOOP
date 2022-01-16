package com.homework;

public class CompanyAccount extends Account{
    private String companyName;

    public CompanyAccount(Integer userId, String password, String description, String profileImage, int numberOfFollowers, int numberOfFollowings, Story[] stories, Post[] posts, String companyName) {
        super(userId, password, description, profileImage, numberOfFollowers, numberOfFollowings, stories, posts);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
