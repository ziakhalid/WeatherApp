package co.zia.khalid.weatherapp.data.source

import co.zia.khalid.weatherapp.data.Result
import co.zia.khalid.weatherapp.data.WeatherInfo

interface WeatherRepository {
    fun getWeatherInfoByLatLong(latLong: String, forceUpdate: Boolean = false): Result<WeatherInfo>
    fun getWeatherInfoByCityId(cityId: Int, forceUpdate: Boolean = false): Result<WeatherInfo>
    fun getWeatherInfoByCityName(cityName: String, forceUpdate: Boolean = false): Result<WeatherInfo>
    fun saveWeatherInfo(weatherInfo: WeatherInfo)
    fun deleteWeatherInfo(cityId: Int)
    fun deleteAllInfo()
}