package com.sn.googleplaceapilibrary.GooglePlacesAPI.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Created by parag.chauhan on 7/28/2015.
 */
public class Geometry_Object {
    @SerializedName("location")
    public Location_Object location_object ;

    public Location_Object getLocation_object() {
        return location_object;
    }

    public void setLocation_object(Location_Object location_object) {
        this.location_object = location_object;
    }

    public Viewport_Object getViewport_object() {
        return viewport_object;
    }

    public void setViewport_object(Viewport_Object viewport_object) {
        this.viewport_object = viewport_object;
    }

    @SerializedName("viewport")
    public Viewport_Object viewport_object ;

}
