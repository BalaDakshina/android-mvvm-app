package com.example.android_mvvm_test.features.repoList.domain

import javax.inject.Inject

class RepoListRepository @Inject constructor() {
    fun getRepoList(): List<String> {
        return listOf("Android", "iOS", "Web")
    }
}
