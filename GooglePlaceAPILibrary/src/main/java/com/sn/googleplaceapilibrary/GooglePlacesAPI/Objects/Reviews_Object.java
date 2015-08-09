package com.sn.googleplaceapilibrary.GooglePlacesAPI.Objects;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by parag.chauhan on 7/30/2015.
 */
public class Reviews_Object {

    public ArrayList<Aspects_Object> getArrAspects() {
        return arrAspects;
    }

    public void setArrAspects(ArrayList<Aspects_Object> arrAspects) {
        this.arrAspects = arrAspects;
    }

    @SerializedName("aspects")
    public ArrayList<Aspects_Object> arrAspects ;

    public String author_name,author_url,language,rating,text,time ;



    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthor_url() {
        return author_url;
    }

    public void setAuthor_url(String author_url) {
        this.author_url = author_url;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
