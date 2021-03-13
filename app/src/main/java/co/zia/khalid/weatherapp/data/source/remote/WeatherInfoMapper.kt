package co.zia.khalid.weatherapp.data.source.remote

import co.zia.khalid.weatherapp.data.WeatherInfo
import javax.inject.Inject

class WeatherInfoMapper @Inject constructor() :
    RemoteToDataMapper<@JvmSuppressWildcards WeatherInfoRemoteModel, @JvmSuppressWildcards WeatherInfo> {
    override fun mapToData(remote: WeatherInfoRemoteModel) = with(remote) {
        WeatherInfo(
            temp = main.temp,
            feelsLike = main.feelsLike,
            tempMin = main.tempMin,
            tempMax = main.tempMax,
            pressure = main.pressure,
            humidity = main.humidity,
            windSpeed = wind.speed,
            mainInfo = weather[0].mainInfo,
            description = weather[0].description,
            icon = weather[0].icon,
            cityId = cityId,
            cityName = cityName,
            lat = coord.lat,
            long = coord.lon
        )

    }
}