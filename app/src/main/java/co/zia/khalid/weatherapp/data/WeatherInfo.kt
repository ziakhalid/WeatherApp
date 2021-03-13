package co.zia.khalid.weatherapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "WeatherInfo")
data class WeatherInfo @JvmOverloads constructor(
        @ColumnInfo var temp: Double = 0.0,
        @ColumnInfo var feelsLike: Double = 0.0,
        @ColumnInfo var tempMin: Double = 0.0,
        @ColumnInfo var tempMax: Double = 0.0,
        @ColumnInfo var pressure: Int = 0,
        @ColumnInfo var humidity: Int = 0,
        @ColumnInfo var windSpeed: Double = 0.0,
        @ColumnInfo var mainInfo: String = "",
        @ColumnInfo var description: String = "",
        @ColumnInfo var icon: String = "",
        @ColumnInfo var cityId: Int = 0,
        @ColumnInfo var cityName: String = "",
        @ColumnInfo var lat: Double = 0.0,
        @ColumnInfo var long: Double = 0.0,
        @PrimaryKey @ColumnInfo var entryId: String = UUID.randomUUID().toString()
)


