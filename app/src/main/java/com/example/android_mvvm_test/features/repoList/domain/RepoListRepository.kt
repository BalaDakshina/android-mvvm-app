package com.example.android_mvvm_test.features.repoList.domain

import com.example.android_mvvm_test.features.repoList.network.RepoListService
import javax.inject.Inject

class RepoListRepository @Inject constructor(
    private val repoListService: RepoListService
) {
    fun getRepoList(): List<String> {
        return repoListService.getRepoList().execute().body()?.map { it.login } ?: emptyList()
    }
}
