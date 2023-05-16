package com.cleanarchitecture.app.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.cleanarchitecture.app.presentation.ui.theme.CleanArchitecturePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanArchitecturePracticeTheme {
                Surface(
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}