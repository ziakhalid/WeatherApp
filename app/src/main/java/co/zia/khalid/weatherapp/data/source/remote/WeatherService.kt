package co.zia.khalid.weatherapp.data.source.remote

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WeatherService {

    @GET("/data/2.5/weather?lat={lat}&lon={lon}&appid={appid}")
    suspend fun getCitiesByLatLong(
        @Path("lat") lat: String,
        @Path("lon") lon: String,
        @Path("appid") appid: String
    ): List<WeatherInfoRemoteModel>

}