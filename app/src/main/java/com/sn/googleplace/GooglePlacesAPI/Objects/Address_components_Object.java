package com.sn.googleplace.GooglePlacesAPI.Objects;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by parag.chauhan on 7/30/2015.
 */
public class Address_components_Object {
    public String long_name ,short_name ;

    public String getLong_name() {
        return long_name;
    }

    public void setLong_name(String long_name) {
        this.long_name = long_name;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public List<String> getTypesList() {
        return typesList;
    }

    public void setTypesList(List<String> typesList) {
        this.typesList = typesList;
    }

    @SerializedName("types")
    public List<String> typesList ;
}
