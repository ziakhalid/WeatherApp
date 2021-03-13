package co.zia.khalid.weatherapp.data.source.remote

import com.squareup.moshi.Json

data class WeatherInfoRemoteModel(
    @Json(name = "coord") val coord: Coordinate = Coordinate(),
    @Json(name = "weather") val weather: List<Weather> = emptyList(),
    @Json(name = "main") val main: Main = Main(),
    @Json(name = "visibility") val visibility: Int = 0,
    @Json(name = "wind") val wind: Wind = Wind(),
    @Json(name = "id") val cityId: Int = 0,
    @Json(name = "name") val cityName: String = "",
)

data class Coordinate(
    @Json(name = "lon") val lon: Double = 0.0,
    @Json(name = "lat") val lat: Double = 0.0
)

data class Weather(
    @Json(name = "id") val id: Int = 0,
    @Json(name = "main") val mainInfo: String = "",
    @Json(name = "description") val description: String = "",
    @Json(name = "icon") val icon: String = "",
)

data class Main(
    @Json(name = "temp") val temp: Double = 0.0,
    @Json(name = "feels_like") val feelsLike: Double = 0.0,
    @Json(name = "temp_min") val tempMin: Double = 0.0,
    @Json(name = "temp_max") val tempMax: Double = 0.0,
    @Json(name = "pressure") val pressure: Int = 0,
    @Json(name = "humidity") val humidity: Int = 0,
)

data class Wind(
    @Json(name = "speed") val speed: Double = 0.0,
    @Json(name = "deg") val deg: Int = 0,
    @Json(name = "gust") val gust: Double = 0.0,
)

