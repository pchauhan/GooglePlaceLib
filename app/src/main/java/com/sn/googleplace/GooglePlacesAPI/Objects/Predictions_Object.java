package com.sn.googleplace.GooglePlacesAPI.Objects;

/**
 * Created by parag.chauhan on 7/31/2015.
 */
public class Predictions_Object {
    public String  description,id ,place_id,reference;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

/*    @SerializedName("matched_substrings")
    ArrayList<Matched_Substrings_Object> arrMatchedSubstrings ;

    @SerializedName("terms")
    ArrayList<Terms_Object> arrTerms ;

    @SerializedName("types")
    List<String> arrTypes ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public ArrayList<Matched_Substrings_Object> getArrMatchedSubstrings() {
        return arrMatchedSubstrings;
    }

    public void setArrMatchedSubstrings(ArrayList<Matched_Substrings_Object> arrMatchedSubstrings) {
        this.arrMatchedSubstrings = arrMatchedSubstrings;
    }

    public ArrayList<Terms_Object> getArrTerms() {
        return arrTerms;
    }

    public void setArrTerms(ArrayList<Terms_Object> arrTerms) {
        this.arrTerms = arrTerms;
    }

    public List<String> getArrTypes() {
        return arrTypes;
    }

    public void setArrTypes(List<String> arrTypes) {
        this.arrTypes = arrTypes;
    }
    */
}
