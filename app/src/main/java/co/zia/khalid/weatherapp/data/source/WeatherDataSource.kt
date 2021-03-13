package co.zia.khalid.weatherapp.data.source

import co.zia.khalid.weatherapp.data.Result
import co.zia.khalid.weatherapp.data.WeatherInfo

interface WeatherDataSource {
    suspend fun getWeatherInfoByLatLong(lat: String, lon: String): Result<WeatherInfo>
    suspend fun getWeatherInfoByCityId(cityId: Int): Result<WeatherInfo>
    suspend fun getWeatherInfoByCityName(cityName: String): Result<WeatherInfo>
    suspend fun saveWeatherInfo(weatherInfo: WeatherInfo)
    suspend fun deleteWeatherInfo(cityId: Int)
    suspend fun deleteAllInfo()
}