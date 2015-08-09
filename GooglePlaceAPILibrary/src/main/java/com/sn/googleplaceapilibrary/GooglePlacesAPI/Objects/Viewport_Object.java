package com.sn.googleplaceapilibrary.GooglePlacesAPI.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Created by parag.chauhan on 7/30/2015.
 */
public class Viewport_Object {
    @SerializedName("northeast")
    public NorthEast_Object northEast_object ;
    @SerializedName("southwest")
    public SouthWest_Object southWest_object ;

    public NorthEast_Object getNorthEast_object() {
        return northEast_object;
    }

    public void setNorthEast_object(NorthEast_Object northEast_object) {
        this.northEast_object = northEast_object;
    }

    public SouthWest_Object getSouthWest_object() {
        return southWest_object;
    }

    public void setSouthWest_object(SouthWest_Object southWest_object) {
        this.southWest_object = southWest_object;
    }
}
