package ru.netology.domain;

public class ReportsInfo {
    private int count;

    public boolean isUserRepost() {
        return userRepost;
    }

    public void setUserRepost(boolean userRepost) {
        this.userRepost = userRepost;
    }

    private boolean userRepost;
}
