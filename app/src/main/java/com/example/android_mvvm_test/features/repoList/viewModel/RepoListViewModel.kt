package com.example.android_mvvm_test.features.repoList.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android_mvvm_test.features.repoList.domain.RepoListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RepoListViewModel @Inject constructor(
    private val repoListUseCase: RepoListUseCase
) : ViewModel() {
    private val _repoList = MutableStateFlow(emptyList<String>())
    val repoList: StateFlow<List<String>> = _repoList

    fun refreshRepoList() {
        viewModelScope.launch(Dispatchers.IO) {
            _repoList.update { repoListUseCase() }
        }
    }
}