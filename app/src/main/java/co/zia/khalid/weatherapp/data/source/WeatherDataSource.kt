package co.zia.khalid.weatherapp.data.source

import co.zia.khalid.weatherapp.data.Result
import co.zia.khalid.weatherapp.data.WeatherInfo

interface WeatherDataSource {
    fun getWeatherInfoByLatLong(latLong: String): Result<WeatherInfo>
    fun getWeatherInfoByCityId(cityId: Int): Result<WeatherInfo>
    fun getWeatherInfoByCityName(cityName: String): Result<WeatherInfo>
    fun saveWeatherInfo(weatherInfo: WeatherInfo)
    fun deleteWeatherInfo(cityId: Int)
    fun deleteAllInfo()
}