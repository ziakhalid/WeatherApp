package co.zia.khalid.weatherapp.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import co.zia.khalid.weatherapp.data.WeatherInfo

@Database(entities = [WeatherInfo::class], version = 1, exportSchema = false)
abstract class WeatherDatabase : RoomDatabase() {
    abstract fun weatherInfoDao(): WeatherInfoDao
}