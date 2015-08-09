package com.sn.googleplaceapilibrary.GooglePlacesAPI.Objects;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by parag.chauhan on 7/28/2015.
 */
public class Results_Details_Object {

    @SerializedName("address_components")
    public ArrayList<Address_components_Object> arrAddressComponents;


    public ArrayList<Address_components_Object> getArrAddressComponents() {
        return arrAddressComponents;
    }

    public void setArrAddressComponents(ArrayList<Address_components_Object> arrAddressComponents) {
        this.arrAddressComponents = arrAddressComponents;
    }

    public String formatted_address, formatted_phone_number;

    public String getFormatted_address() {
        return formatted_address;
    }

    public void setFormatted_address(String formatted_address) {
        this.formatted_address = formatted_address;
    }

    public String getFormatted_phone_number() {
        return formatted_phone_number;
    }

    public void setFormatted_phone_number(String formatted_phone_number) {
        this.formatted_phone_number = formatted_phone_number;
    }

    @SerializedName("geometry")
    public Geometry_Object geometryObject;

    public Geometry_Object getGeometryObject() {
        return geometryObject;
    }

    public void setGeometryObject(Geometry_Object geometryObject) {
        this.geometryObject = geometryObject;
    }

    public String

            user_ratings_total,
            utc_offset,
            scope,
            vicinity,
            url, website;
    public String icon, id, international_phone_number, name, place_id, rating, reference;

    public String getIcon() {
        return icon;
    }

    public String getUser_ratings_total() {
        return user_ratings_total;
    }

    public void setUser_ratings_total(String user_ratings_total) {
        this.user_ratings_total = user_ratings_total;
    }

    public String getUtc_offset() {
        return utc_offset;
    }

    public void setUtc_offset(String utc_offset) {
        this.utc_offset = utc_offset;
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

    public String getInternational_phone_number() {
        return international_phone_number;
    }

    public void setInternational_phone_number(String international_phone_number) {
        this.international_phone_number = international_phone_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
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


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public ArrayList<Reviews_Object> getArrReviews() {
        return arrReviews;
    }

    public void setArrReviews(ArrayList<Reviews_Object> arrReviews) {
        this.arrReviews = arrReviews;
    }

    @SerializedName("reviews")
    public ArrayList<Reviews_Object> arrReviews;

    @SerializedName("opening_hours")
    public Opening_hours_Object openingHoursObject;

    public Opening_hours_Object getOpeningHoursObject() {
        return openingHoursObject;
    }

    public void setOpeningHoursObject(Opening_hours_Object openingHoursObject) {
        this.openingHoursObject = openingHoursObject;
    }
    @SerializedName("photos")
    public ArrayList<Photos_Object>  arrPhoto;

    @SerializedName("types")
    List<String> arrTypes;


    public ArrayList<Photos_Object> getArrPhoto() {
        return arrPhoto;
    }

    public void setArrPhoto(ArrayList<Photos_Object> arrPhoto) {
        this.arrPhoto = arrPhoto;
    }

    public List<String> getArrTypes() {
        return arrTypes;
    }

    public void setArrTypes(List<String> arrTypes) {
        this.arrTypes = arrTypes;
    }
}
