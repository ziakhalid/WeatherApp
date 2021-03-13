package co.zia.khalid.weatherapp.data.source.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import co.zia.khalid.weatherapp.data.WeatherInfo

@Dao
interface WeatherInfoDao {

    @Query("SELECT * FROM WeatherInfo WHERE lat = :lat AND long = :long")
    fun getWeatherInfoByLatLong(lat: String, long: String): WeatherInfo?

    @Query("SELECT * FROM WeatherInfo WHERE cityId = :cityId")
    fun getWeatherInfoByCityId(cityId: Int): WeatherInfo?

    @Query("SELECT * FROM WeatherInfo WHERE cityName = :cityName")
    fun getWeatherInfoByCityName(cityName: String): WeatherInfo?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveWeatherInfo(weatherInfo: WeatherInfo)

    @Query("DELETE FROM WeatherInfo WHERE cityId = :cityId")
    fun deleteWeatherInfo(cityId: Int)

    @Query("DELETE FROM WeatherInfo")
    fun deleteAllInfo()
}