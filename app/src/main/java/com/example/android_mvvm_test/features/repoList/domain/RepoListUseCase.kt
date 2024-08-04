package com.example.android_mvvm_test.features.repoList.domain

import javax.inject.Inject

class RepoListUseCase @Inject constructor(
    private val repoListRepository: RepoListRepository
) {
    operator fun invoke(): List<String> {
        return repoListRepository.getRepoList()
    }
}
