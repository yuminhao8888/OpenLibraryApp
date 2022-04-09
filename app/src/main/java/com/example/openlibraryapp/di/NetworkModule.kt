package com.example.openlibraryapp.di

import com.example.openlibraryapp.rest.OpenLibraryApi
import com.example.openlibraryapp.rest.OpenLibraryRepository
import com.example.openlibraryapp.rest.OpenLibraryRepositoryImpl
import com.example.openlibraryapp.rest.RequestInterceptor
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

@Module
class NetworkModule {

    @Provides
    fun providesGson() = Gson()

    @Provides
    fun providesLoggingInterceptor() = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    @Provides
    fun providesRequestInterceptor() = RequestInterceptor()

    @Provides
    fun providesOkHttpClient(
        requestInterceptor: RequestInterceptor,
        loggingInterceptor: HttpLoggingInterceptor
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(requestInterceptor)
            .addInterceptor(loggingInterceptor)
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .build()
    }

    @Provides
    fun providesRetrofitService(okHttpClient: OkHttpClient, gson: Gson): OpenLibraryApi {
        return Retrofit.Builder()
            .baseUrl(OpenLibraryApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))

            .client(okHttpClient)
            .build()
            .create(OpenLibraryApi::class.java)
    }

    @Provides
    fun providesOpenLibraryRepository(openLibraryApi: OpenLibraryApi): OpenLibraryRepository {
        return OpenLibraryRepositoryImpl(openLibraryApi)
    }

    @Provides
    fun providesDispatcher(): CoroutineDispatcher = Dispatchers.IO
}