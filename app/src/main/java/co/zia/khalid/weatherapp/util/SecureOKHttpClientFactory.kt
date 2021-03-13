package co.zia.khalid.weatherapp.util

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

abstract class SecureOKHttpClientFactory {

    open fun getOkHttpClient(): OkHttpClient {
        val clientBuilder = makeOkHttpClientBuilder()
        return clientBuilder.build()
    }

    private fun makeOkHttpClientBuilder(): OkHttpClient.Builder {
        val clientBuilder = OkHttpClient().newBuilder()
        setupClient(clientBuilder)
        addInterceptors(clientBuilder)
        return clientBuilder
    }

    private fun setupClient(client: OkHttpClient.Builder) {
        client.connectTimeout(10L, TimeUnit.SECONDS)
        client.readTimeout(10L, TimeUnit.SECONDS)
    }

    open fun addInterceptors(client: OkHttpClient.Builder) {

    }

}