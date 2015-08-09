package com.sn.googleplaceapilibrary.GooglePlacesAPI.Objects;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by parag.chauhan on 7/28/2015.
 */
public class Photos_Object {
    public int height ,width ;
    public String photo_reference ;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getPhoto_reference() {
        return photo_reference;
    }

    public void setPhoto_reference(String photo_reference) {
        this.photo_reference = photo_reference;
    }

    public List<String> getListHtml_attributions() {
        return listHtml_attributions;
    }

    public void setListHtml_attributions(List<String> listHtml_attributions) {
        this.listHtml_attributions = listHtml_attributions;
    }

    @SerializedName("html_attributions")
    public List<String> listHtml_attributions ;
}
