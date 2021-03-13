package co.zia.khalid.weatherapp.data.source

import co.zia.khalid.weatherapp.data.Result
import co.zia.khalid.weatherapp.data.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherInfoByLatLong(lat: String, lon: String, forceUpdate: Boolean = false): Result<WeatherInfo>
    suspend fun getWeatherInfoByCityId(cityId: Int, forceUpdate: Boolean = false): Result<WeatherInfo>
    suspend fun getWeatherInfoByCityName(cityName: String, forceUpdate: Boolean = false): Result<WeatherInfo>
    suspend fun saveWeatherInfo(weatherInfo: WeatherInfo)
    suspend fun deleteWeatherInfo(cityId: Int)
    suspend fun deleteAllInfo()
}