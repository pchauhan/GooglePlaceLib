package com.sn.googleplace.GooglePlacesAPI.Objects;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by parag.chauhan on 7/28/2015.
 */
public class Results_Object {

    public String icon, id, name, place_id, reference, scope, vicinity;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getVicinity() {
        return vicinity;
    }

    public void setVicinity(String vicinity) {
        this.vicinity = vicinity;
    }
    public Geometry_Object getGeometryObject() {
        return geometryObject;
    }

    public void setGeometryObject(Geometry_Object geometryObject) {
        this.geometryObject = geometryObject;
    }
    public Opening_hours_Object getOpeningHoursObject() {
        return openingHoursObject;
    }

    public void setOpeningHoursObject(Opening_hours_Object openingHoursObject) {
        this.openingHoursObject = openingHoursObject;
    }










    public List<String> getListTypes() {
     return listTypes;
 }

    public void setListTypes(List<String> listTypes) {
        this.listTypes = listTypes;
    }
   @SerializedName("geometry")
    public Geometry_Object geometryObject;
    @SerializedName("types")
    public List<String> listTypes;

    @SerializedName("opening_hours")
    public Opening_hours_Object openingHoursObject;

    @SerializedName("photos")
    public ArrayList<Photos_Object> photosObject;

    public ArrayList<Photos_Object> getPhotosObject() {
        return photosObject;
    }

    public void setPhotosObject(ArrayList<Photos_Object> photosObject) {
        this.photosObject = photosObject;
    }
}
