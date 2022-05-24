package com.aldimas.weatherapp.data.network

import com.aldimas.weatherapp.BuildConfig.API_KEY
import com.aldimas.weatherapp.data.response.ForecastResponse
import com.aldimas.weatherapp.data.response.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
interface ApiService {

    //mengambil data icon, suhu, kota
    @GET("weather")//endpoint
    fun weatherByCity(
//        @Path//letaknya sebelum endpoint
        @Query("q") city: String,
        @Query("appid") apiKey: String? = API_KEY
    ): Call<WeatherResponse>


    //Mengambil data yang lain
    @GET("forecast")
    fun forecastByCity(
        @Query("q") city: String,
        @Query("appid") apiKey: String? = API_KEY
    ): Call<ForecastResponse>

    //
    @GET("weather")
    fun weatherByCurrentLocation(
        @Query("lat") lat : Double,
        @Query("lon") lon : Double,
        @Query("appid") apiKey: String? = API_KEY
    ): Call<WeatherResponse>

    @GET("forecast")
    fun forecastByCurrentLocation(
        @Query("lat") city: Double,
        @Query("lon") apiKey: Double = API_KEY
    ): Call<ForecastResponse>
}

