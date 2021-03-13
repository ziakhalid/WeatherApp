package co.zia.khalid.weatherapp.data.source

import co.zia.khalid.weatherapp.data.Result
import co.zia.khalid.weatherapp.data.WeatherInfo
import javax.inject.Inject

class DefaultWeatherRepository @Inject constructor(
) : WeatherRepository{
    override suspend fun getWeatherInfoByLatLong(
        latLong: String,
        forceUpdate: Boolean
    ): Result<WeatherInfo> {
        TODO("Not yet implemented")
    }

    override suspend fun getWeatherInfoByCityId(
        cityId: Int,
        forceUpdate: Boolean
    ): Result<WeatherInfo> {
        TODO("Not yet implemented")
    }

    override suspend fun getWeatherInfoByCityName(
        cityName: String,
        forceUpdate: Boolean
    ): Result<WeatherInfo> {
        TODO("Not yet implemented")
    }

    override suspend fun saveWeatherInfo(weatherInfo: WeatherInfo) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteWeatherInfo(cityId: Int) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAllInfo() {
        TODO("Not yet implemented")
    }

}