package com.sn.googleplace.GooglePlacesAPI.RequestAPI;

import android.content.Context;

import com.loopj.android.http.RequestParams;
import com.sn.googleplace.NetworkRequest.Request_AsynchTask;
import com.sn.googleplace.NetworkRequest.Response_Interface;
import com.sn.googleplace.NetworkRequest.WebUrls;

/**
 * Created by parag.chauhan on 7/31/2015.
 */
public class GooglePlace_API {
    public static void GooglePlace_NearBy_API(Context context, RequestParams params, Response_Interface response_interface, boolean isShowProgress) {
        Request_AsynchTask request_asynchTask = new Request_AsynchTask(context, WebUrls.google_NearBy, params, response_interface, isShowProgress);
    }
    public static void GooglePlace_RadarSearch_API(Context context, RequestParams params, Response_Interface response_interface, boolean isShowProgress) {
        Request_AsynchTask request_asynchTask = new Request_AsynchTask(context, WebUrls.google_RadarSearch, params, response_interface, isShowProgress);
    }
    public static void GooglePlace_TextSearch_API(Context context, RequestParams params, Response_Interface response_interface, boolean isShowProgress) {
        Request_AsynchTask request_asynchTask = new Request_AsynchTask(context, WebUrls.google_TextSearch, params, response_interface, isShowProgress);
    }
    public static void GooglePlace_AutoComplete_API(Context context, RequestParams params, Response_Interface response_interface, boolean isShowProgress) {
        Request_AsynchTask request_asynchTask = new Request_AsynchTask(context, WebUrls.google_AutoComplete, params, response_interface, isShowProgress);
    }
    public static  void  GooglePlace_QueryComplete_API(Context context, RequestParams params, Response_Interface response_interface, boolean isShowProgress) {
        Request_AsynchTask request_asynchTask = new Request_AsynchTask(context, WebUrls.google_AutoComplete, params, response_interface, isShowProgress);
    }
    public static void GooglePlace_Details_API(Context context, RequestParams params, Response_Interface response_interface, boolean isShowProgress) {
        Request_AsynchTask request_asynchTask = new Request_AsynchTask(context, WebUrls.google_Placedetails, params, response_interface, isShowProgress);
    }
}
