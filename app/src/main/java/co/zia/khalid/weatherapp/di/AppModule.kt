package co.zia.khalid.weatherapp.di

import co.zia.khalid.weatherapp.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    fun provideOpenWeatherApiKey() = BuildConfig.API_KEY


}