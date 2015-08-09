package com.sn.googleplace.GooglePlacesAPI.Objects;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by parag.chauhan on 7/30/2015.
 */
public class PlaceDetailsAPI_Response_Object {
    public String error_message ,status;
    List<String> html_attributions ;

    @SerializedName("result")
    Results_Details_Object resultsDetailsObject ;

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getHtml_attributions() {
        return html_attributions;
    }

    public void setHtml_attributions(List<String> html_attributions) {
        this.html_attributions = html_attributions;
    }

    public Results_Details_Object getResultsDetailsObject() {
        return resultsDetailsObject;
    }

    public void setResultsDetailsObject(Results_Details_Object resultsDetailsObject) {
        this.resultsDetailsObject = resultsDetailsObject;
    }
}
