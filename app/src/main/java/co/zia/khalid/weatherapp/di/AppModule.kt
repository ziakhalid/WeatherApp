package co.zia.khalid.weatherapp.di

import android.content.Context
import androidx.room.Room
import co.zia.khalid.weatherapp.BuildConfig
import co.zia.khalid.weatherapp.data.WeatherInfo
import co.zia.khalid.weatherapp.data.source.local.WeatherDatabase
import co.zia.khalid.weatherapp.data.source.remote.RemoteToDataMapper
import co.zia.khalid.weatherapp.data.source.remote.WeatherInfoMapper
import co.zia.khalid.weatherapp.data.source.remote.WeatherInfoRemoteModel
import co.zia.khalid.weatherapp.util.OkHttpClientFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Named("api_key")
    @Provides
    fun provideOpenWeatherApiKey() = BuildConfig.API_KEY

    @Singleton
    @Provides
    fun provideMoshi(): Moshi {
        return Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
    }

    @Singleton
    @Provides
    fun provideOkHttpClientFactory(): OkHttpClientFactory {
        return OkHttpClientFactory()
    }

    @Singleton
    @Provides
    fun provideOkHttpClient(okHttpClientFactory: OkHttpClientFactory): OkHttpClient {
        return okHttpClientFactory.getOkHttpClient()
    }

    @Singleton
    @Provides
    fun provideRetrofit(
        moshi: Moshi,
        client: OkHttpClient
    ): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .baseUrl(" http://api.openweathermap.org")
            .client(client)
            .build()
    }

    @Singleton
    @Provides
    fun provideDataBase(@ApplicationContext context: Context): WeatherDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            WeatherDatabase::class.java,
            "Weather.db"
        ).build()
    }

    @Singleton
    @Provides
    fun provideIoDispatcher() = Dispatchers.IO

}

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModuleBinds {
    @Binds
    abstract fun bindBannerMapper(mapper: WeatherInfoMapper): RemoteToDataMapper<@JvmSuppressWildcards WeatherInfoRemoteModel, @JvmSuppressWildcards WeatherInfo>

}