package com.tsdreamdeveloper.maps;

import com.tsdreamdeveloper.maps.model.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


/**
 * Created by navneet on 17/7/16.
 */
public interface RetrofitMaps {

    /*
     * Retrofit get annotation with our URL
     * And our method that will return us details of student.
     */
    @GET("api/directions/json?")
    Call<Example> getDistanceDuration(@Query("key") String apiKey, @Query("units") String units, @Query("origin") String origin, @Query("destination") String destination, @Query("mode") String mode);

}
