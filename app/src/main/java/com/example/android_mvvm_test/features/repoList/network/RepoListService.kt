package com.example.android_mvvm_test.features.repoList.network

import com.example.android_mvvm_test.features.repoList.models.UsersResponse
import retrofit2.Call
import retrofit2.http.GET

interface RepoListService {
    @GET("users?since=2024")
    fun getRepoList(): Call<UsersResponse>
}
