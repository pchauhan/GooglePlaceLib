package com.sn.googleplaceapilibrary.GooglePlacesAPI.Objects;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by parag.chauhan on 7/31/2015.
 */
public class Result_AutoComplete_Object {
    @SerializedName("predictions")
    ArrayList<Predictions_Object> arrPredictions ;
}
