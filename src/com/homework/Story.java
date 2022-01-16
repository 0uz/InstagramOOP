package com.homework;

enum StoryType{
    PHOTO,
    VIDEO
}

public class Story {
    private Integer storyId;
    private StoryType type;
    private String content;

    public Story(Integer storyId, StoryType type, String content) {
        this.storyId = storyId;
        this.type = type;
        this.content = content;
    }

    public Integer getStoryId() {
        return storyId;
    }

    public void setStoryId(Integer storyId) {
        this.storyId = storyId;
    }

    public StoryType getType() {
        return type;
    }

    public void setType(StoryType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
