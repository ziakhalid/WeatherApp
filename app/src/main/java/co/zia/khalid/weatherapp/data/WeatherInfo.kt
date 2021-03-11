package co.zia.khalid.weatherapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


@Entity(tableName = "WeatherInfo")
data class WeatherInfo @JvmOverloads constructor(
        @ColumnInfo var temp: Float = 0.0f,
        @ColumnInfo var feelsLike: Float = 0.0f,
        @ColumnInfo var tempMin: Float = 0.0f,
        @ColumnInfo var tempMax: Float = 0.0f,
        @ColumnInfo var pressure: Int = 0,
        @ColumnInfo var humidity: Int = 0,
        @ColumnInfo var windSpeed: Int = 0,
        @ColumnInfo var main: String = "",
        @ColumnInfo var description: String = "",
        @ColumnInfo var icon: String = "",
        @ColumnInfo var cityId: Int = 0,
        @ColumnInfo var cityName: String = "",
        @ColumnInfo var lat: String = "",
        @ColumnInfo var long: String = "",
        @PrimaryKey @ColumnInfo var entryId: String = UUID.randomUUID().toString()
)


