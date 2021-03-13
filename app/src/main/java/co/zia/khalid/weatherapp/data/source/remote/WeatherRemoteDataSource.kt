package co.zia.khalid.weatherapp.data.source.remote

import co.zia.khalid.weatherapp.data.Result
import co.zia.khalid.weatherapp.data.WeatherInfo
import co.zia.khalid.weatherapp.data.source.WeatherDataSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.lang.Exception
import javax.inject.Inject
import javax.inject.Named

class WeatherRemoteDataSource @Inject constructor(
        private val weatherService: WeatherService,
        private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO,
        @Named("api_key") private val apiKey: String,
) : WeatherDataSource {
    override suspend fun getWeatherInfoByLatLong(lat: String, lon: String) = withContext(ioDispatcher){

        try {
           val
        }catch (e:Exception){

        }

    }

    override suspend fun getWeatherInfoByCityId(cityId: Int): Result<WeatherInfo> {
        TODO("Not yet implemented")
    }

    override suspend fun getWeatherInfoByCityName(cityName: String): Result<WeatherInfo> {
        TODO("Not yet implemented")
    }

    override suspend fun saveWeatherInfo(weatherInfo: WeatherInfo) {
        //No need to implement for Remote Data Source
    }

    override suspend fun deleteWeatherInfo(cityId: Int) {
        //No need to implement for Remote Data Source
    }

    override suspend fun deleteAllInfo() {
        //No need to implement for Remote Data Source
    }

}