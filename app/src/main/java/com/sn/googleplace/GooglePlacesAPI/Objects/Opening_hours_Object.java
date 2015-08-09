package com.sn.googleplace.GooglePlacesAPI.Objects;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by parag.chauhan on 7/28/2015.
 */
public class Opening_hours_Object {

    public boolean open_now ;

    public List<String> getListWeekday() {
        return listWeekday;
    }

    public void setListWeekday(List<String> listWeekday) {
        this.listWeekday = listWeekday;
    }

    public boolean getOpen_now() {
        return open_now;
    }

    public void setOpen_now(boolean open_now) {
        this.open_now = open_now;
    }

    @SerializedName("weekday_text")
    public List<String> listWeekday;

    @SerializedName("periods")
    public ArrayList<Periods_Object> arrPeriod ;
}
