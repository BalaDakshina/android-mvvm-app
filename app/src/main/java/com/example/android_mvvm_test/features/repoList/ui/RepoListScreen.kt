package com.example.android_mvvm_test.features.repoList.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import com.example.android_mvvm_test.features.repoList.viewModel.RepoListViewModel

@Composable
fun RepoListScreen(
    viewModel: RepoListViewModel = hiltViewModel()
) {
    viewModel.refreshRepoList()
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(48.dp)
    ) {
        Column {
            Text(
                modifier = Modifier.padding(bottom = 8.dp),
                text = "RepoListScreen"
            )

            viewModel.repoList.collectAsState().value.forEach {
                Text(text = it)
            }
        }
    }
}
