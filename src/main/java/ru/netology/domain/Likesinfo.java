package ru.netology.domain;

public class Likesinfo {
    private int count;
    private boolean userLikes;

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    private boolean canLike;
    private boolean canPublish;

}
