package com.sn.googleplace.GooglePlacesAPI.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Created by parag.chauhan on 7/28/2015.
 */
public class Location_Object {

    @SerializedName("lat")
    public double latitude;

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @SerializedName("lng")
    public double longitude;
}
