package com.example.nhom3_04_04_listview.model;

public class Technology {
    private int resouceImg;
    private String title,sub,content;

    public Technology() {
    }

    public Technology(int resouceImg, String title,
                      String sub, String content) {
        this.resouceImg = resouceImg;
        this.title = title;
        this.sub = sub;
        this.content = content;
    }

    public int getResouceImg() {
        return resouceImg;
    }

    public void setResouceImg(int resouceImg) {
        this.resouceImg = resouceImg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
}
