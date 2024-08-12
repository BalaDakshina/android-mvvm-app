package com.example.android_mvvm_test.features.repoList.di

import com.example.android_mvvm_test.features.repoList.network.RepoListService
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

@Module
@InstallIn(ViewModelComponent::class)
object RepoListModule {

    @Provides
    @Reusable
    fun provideGitHubService(
    ): RepoListService {
        val url = "https://api.github.com/"
        return Retrofit.Builder()
            .baseUrl(url)
            .client(
                OkHttpClient.Builder()
                    .readTimeout(30L, TimeUnit.SECONDS)
                    .build()
            )
            .addConverterFactory(
                GsonConverterFactory.create()
            )
            .build()
            .create(RepoListService::class.java)
    }
}