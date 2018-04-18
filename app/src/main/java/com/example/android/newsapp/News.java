package com.example.android.newsapp;


public class News {
    private String sectionName, webTitle,webAuthor, webPublicationDate, webUrl;

    public News(String new_sectionName, String new_webTitle,String new_webAuthor, String new_webPublicationDate, String new_webUrl) {
        sectionName = new_sectionName;
        webTitle = new_webTitle;
        webAuthor=new_webAuthor;
        webPublicationDate = new_webPublicationDate;
        webUrl = new_webUrl;
    }

    public String getSectionName() {
        return sectionName;
    }

    public String getWebTitle() {
        return webTitle;
    }

    public String getWebPublicationDate() {
        return webPublicationDate;
    }

    public String getWebAuthor() {
        return webAuthor;
    }

    public String getWebUrl() {
        return webUrl;
    }
}
