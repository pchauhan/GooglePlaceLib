package com.sn.googleplaceapilibrary.GooglePlacesAPI.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Created by parag.chauhan on 7/30/2015.
 */
public class Periods_Object {
    @SerializedName("close")
    public Close_Object closeObject ;
    @SerializedName("open")
    public Open_Object openObject ;
}
