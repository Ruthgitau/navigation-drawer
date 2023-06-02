package com.example.navigationdrawer

import android.annotation.SuppressLint
import android.app.Notification.Action
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import com.example.navigationdrawer.R.layout.activity_main
import com.example.navigationdrawer.ui.theme.NavigationDrawerTheme

class MainActivity : AppCompatActivity() {




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
        val navController=findNavController(R.id.nav_host_fragment_content_main)
        navController.navigate(R.id.action_homeFragment_to_blankFragment)

    }

}


