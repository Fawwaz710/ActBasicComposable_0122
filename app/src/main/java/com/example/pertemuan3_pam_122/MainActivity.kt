package com.example.pertemuan3_pam_122

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.pertemuan3_pam_122.ui.theme.Pertemuan3_PAM_122Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pertemuan3_PAM_122Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Panggil composable layout utama dengan padding dari Scaffold
                    TataletakBoxColumnRow(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


