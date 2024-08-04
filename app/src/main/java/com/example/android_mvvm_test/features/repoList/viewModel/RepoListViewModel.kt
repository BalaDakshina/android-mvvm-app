package com.example.android_mvvm_test.features.repoList.viewModel

import androidx.lifecycle.ViewModel
import com.example.android_mvvm_test.features.repoList.domain.RepoListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class RepoListViewModel @Inject constructor(
    private val repoListUseCase: RepoListUseCase
) : ViewModel() {
    private val _repoList = MutableStateFlow(repoListUseCase.getRepoList())
    val repoList: StateFlow<List<String>> = _repoList
}