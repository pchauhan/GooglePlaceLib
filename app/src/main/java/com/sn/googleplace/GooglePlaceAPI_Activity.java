package com.sn.googleplace;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.WindowManager;
import android.widget.TextView;


import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.loopj.android.http.RequestParams;
import com.sn.googleplaceapi.R;
import com.sn.googleplaceapilibrary.GooglePlacesAPI.Constant.GooglePlace_API_Constant;
import com.sn.googleplaceapilibrary.GooglePlacesAPI.RequestAPI.GooglePlace_API;
import com.sn.googleplaceapilibrary.NetworkRequest.Response_Interface;
import com.sn.googleplaceapilibrary.NetworkRequest.Response_Object;

public class GooglePlaceAPI_Activity extends AppCompatActivity implements Response_Interface, ConnectionCallbacks,
        OnConnectionFailedListener, LocationListener {
    private static final String TAG = "LocationActivity";
    private static final long INTERVAL = 1000 * 10;
    private static final long FASTEST_INTERVAL = 1000 * 5;

    LocationRequest mLocationRequest;
    GoogleApiClient mGoogleApiClient;
    Location mCurrentLocation;
    boolean isLocationAvailable = true;

    TextView tvResponse ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_place_api_);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.themeColor));
        }
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        tvResponse = (TextView)findViewById(R.id.tvResponse);
       // apiCallForQueryAutoCompleteSearch();
        // apiCallForTextSearch();
        // apiCallForPlaceDetails();

        if (!isGooglePlayServicesAvailable()) {
            finish();
        }
        createLocationRequest();
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addApi(LocationServices.API)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .build();

    }

    public void apiCallForNearBy() {
        RequestParams requestParams = new RequestParams();
        requestParams.put(GooglePlace_API_Constant.LOCATION, mCurrentLocation.getLatitude() + "," + mCurrentLocation.getLongitude());
        requestParams.put(GooglePlace_API_Constant.RADIUS, "200");
        requestParams.put(GooglePlace_API_Constant.KEY, "AIzaSyBh_g9yiO9wI5hBTIOjncsHqXkPaK-g3Qs");
        GooglePlace_API.GooglePlace_NearBy_API(this, requestParams, this, true);
    }

    public void apiCallForTextSearch() {
        RequestParams requestParams = new RequestParams();
        requestParams.put(GooglePlace_API_Constant.QUERY, "KALOL");
        requestParams.put(GooglePlace_API_Constant.KEY, "AIzaSyBh_g9yiO9wI5hBTIOjncsHqXkPaK-g3Qs");
        GooglePlace_API.GooglePlace_TextSearch_API(this, requestParams, this, true);
    }

    public void apiCallForPlaceDetails() {
        RequestParams requestParams = new RequestParams();
        requestParams.put(GooglePlace_API_Constant.PLACEID, "ChIJN1t_tDeuEmsRUsoyG83frY4");
        requestParams.put(GooglePlace_API_Constant.KEY, "AIzaSyBh_g9yiO9wI5hBTIOjncsHqXkPaK-g3Qs");
        GooglePlace_API.GooglePlace_Details_API(this, requestParams, this, true);
    }

    public void apiCallForRadarSearch() {
        RequestParams requestParams = new RequestParams();
        requestParams.put(GooglePlace_API_Constant.LOCATION, mCurrentLocation.getLatitude() + "," + mCurrentLocation.getLongitude());
        requestParams.put(GooglePlace_API_Constant.RADIUS, "200");
        requestParams.put(GooglePlace_API_Constant.KEY, "AIzaSyBh_g9yiO9wI5hBTIOjncsHqXkPaK-g3Qs");
        requestParams.put(GooglePlace_API_Constant.TYPES, GooglePlace_API_Constant.Types.HOSPITAL);
        GooglePlace_API.GooglePlace_RadarSearch_API(this, requestParams, this, true);
    }

    public void apiCallForAutoCompleteSearch() {
        RequestParams requestParams = new RequestParams();
        requestParams.put(GooglePlace_API_Constant.INPUT, "KALOL");
        requestParams.put(GooglePlace_API_Constant.KEY, "AIzaSyBh_g9yiO9wI5hBTIOjncsHqXkPaK-g3Qs");
        GooglePlace_API.GooglePlace_AutoComplete_API(this, requestParams, this, true);
    }

    public void apiCallForQueryAutoCompleteSearch() {
        RequestParams requestParams = new RequestParams();
        requestParams.put(GooglePlace_API_Constant.INPUT, "KALOL");
        requestParams.put(GooglePlace_API_Constant.KEY, "AIzaSyBh_g9yiO9wI5hBTIOjncsHqXkPaK-g3Qs");
        GooglePlace_API. GooglePlace_QueryComplete_API(this, requestParams, this, true);
    }

    private boolean isGooglePlayServicesAvailable() {
        int status = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
        if (ConnectionResult.SUCCESS == status) {
            return true;
        } else {
            GooglePlayServicesUtil.getErrorDialog(status, this, 0).show();
            return false;
        }
    }

    protected void createLocationRequest() {
        mLocationRequest = new LocationRequest();
        mLocationRequest.setInterval(INTERVAL);
        mLocationRequest.setFastestInterval(FASTEST_INTERVAL);
        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
    }

    protected synchronized void buildGoogleApiClient() {
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API).build();
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (mGoogleApiClient != null) {
            mGoogleApiClient.connect();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mGoogleApiClient.isConnected()) {
            startLocationUpdates();
            Log.d(TAG, "Location update resumed .....................");
        }

    }

    @Override
    public void onConnectionFailed(ConnectionResult result) {
        Log.i(TAG, "Connection failed: ConnectionResult.getErrorCode() = "
                + result.getErrorCode());
    }

    @Override
    public void onConnected(Bundle arg0) {
        // Once connected with google api, get the location
        startLocationUpdates();
    }

    protected void startLocationUpdates() {
        PendingResult<Status> pendingResult = LocationServices.FusedLocationApi.requestLocationUpdates(
                mGoogleApiClient, mLocationRequest, this);
        Log.d(TAG, "Location update started ..............: ");
    }

    @Override
    public void onConnectionSuspended(int arg0) {
        mGoogleApiClient.connect();
    }

    /**
     * Method to verify google play services on the device
     */
    @Override
    public void onLocationChanged(Location location) {
        // Assign the new location
        /*Toast.makeText(getApplicationContext(), "Location changed!",
                Toast.LENGTH_SHORT).show();*/
        mCurrentLocation = location;
        if (mCurrentLocation != null) {
            if (isLocationAvailable) {
                isLocationAvailable = false;
                apiCallForNearBy();

                apiCallForRadarSearch();

            }
        }
        // Displaying the new location on UI
    }

    @Override
    public void onCompeleteRequest(Response_Object mResponseObject) {
        if (!mResponseObject.isError) {
            Response_Object response_object = mResponseObject;
            try {
                tvResponse.setText(response_object.mJsonObject.toString());
                //PlaceAPI_Response_Object    placeObject = new GsonBuilder().create().fromJson(response_object.mJsonObject.toString(), PlaceAPI_Response_Object.class);
                //PlaceDetailsAPI_Response_Object placeObject = new GsonBuilder().create().fromJson(response_object.mJsonObject.toString(), PlaceDetailsAPI_Response_Object.class);
                //Result_AutoComplete_Object placeObject = new GsonBuilder().create().fromJson(response_object.mJsonObject.toString(), Result_AutoComplete_Object.class);

                /*
                  JSONArray jsonArray = (response_object.mJsonObject.getJSONArray("predictions"));
                  System.out.print("List="+jsonArray);

                  Gson gson = new Gson();
                  Type listType = new TypeToken<List<Predictions_Object>>() {}.getType();
                  List<Predictions_Object> posts = (List<Predictions_Object>) gson.fromJson(jsonArray.toString(), listType);
                  System.out.print("List="+posts);*/
            } catch (Exception e) {
                System.out.print(e);
            }
        } else {

        }
    }
}
