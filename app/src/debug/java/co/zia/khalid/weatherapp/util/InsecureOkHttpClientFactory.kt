package co.zia.khalid.weatherapp.util

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

open class InsecureOkHttpClientFactory : SecureOKHttpClientFactory(){

    override fun addInterceptors(client: OkHttpClient.Builder) {
        super.addInterceptors(client)
        val logger = HttpLoggingInterceptor()
        logger.level = HttpLoggingInterceptor.Level.BODY
        client.addInterceptor(logger)
    }

}