package co.zia.khalid.weatherapp.data.source.local

import co.zia.khalid.weatherapp.data.Result.Error
import co.zia.khalid.weatherapp.data.Result.Success
import co.zia.khalid.weatherapp.data.WeatherInfo
import co.zia.khalid.weatherapp.data.source.WeatherDataSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class WeatherLocalDataSource @Inject constructor(
    private val weatherInfoDao: WeatherInfoDao,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : WeatherDataSource {
    override suspend fun getWeatherInfoByLatLong(lat: String, lon: String) =
        withContext(ioDispatcher) {
            try {
                val weatherInfo = weatherInfoDao.getWeatherInfoByLatLong(lat, lon)
                weatherInfo?.let {
                    return@withContext Success(it)
                }
                return@withContext Error(Exception("No Data available"))
            } catch (e: Exception) {
                return@withContext Error(e)
            }
        }

    override suspend fun getWeatherInfoByCityId(cityId: Int) = withContext(ioDispatcher) {
        try {
            val weatherInfo = weatherInfoDao.getWeatherInfoByCityId(cityId)
            weatherInfo?.let {
                return@withContext Success(it)
            }
            return@withContext Error(Exception("No Data available"))
        } catch (e: Exception) {
            return@withContext Error(e)
        }
    }

    override suspend fun getWeatherInfoByCityName(cityName: String) = withContext(ioDispatcher) {
        try {
            val weatherInfo = weatherInfoDao.getWeatherInfoByCityName(cityName)
            weatherInfo?.let {
                return@withContext Success(it)
            }
            return@withContext Error(Exception("No Data available"))
        } catch (e: Exception) {
            return@withContext Error(e)
        }
    }

    override suspend fun saveWeatherInfo(weatherInfo: WeatherInfo) = withContext(ioDispatcher){
        weatherInfoDao.saveWeatherInfo(weatherInfo)
    }

    override suspend fun deleteWeatherInfo(cityId: Int) = withContext(ioDispatcher){
        weatherInfoDao.deleteWeatherInfo(cityId)
    }

    override suspend fun deleteAllInfo() = withContext(ioDispatcher){
        weatherInfoDao.deleteAllInfo()
    }

}