package com.example.android_mvvm_test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_mvvm_test.features.repoList.ui.RepoListScreen
import com.example.android_mvvm_test.features.repoList.viewModel.RepoListViewModel
import com.example.android_mvvm_test.ui.theme.AndroidmvvmtestTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidmvvmtestTheme {
                RepoListScreen()
            }
        }
    }
}