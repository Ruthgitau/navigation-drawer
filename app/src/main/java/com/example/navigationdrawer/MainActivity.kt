

import android.annotation.SuppressLint
import android.app.Notification.Action
import android.os.Bundle
import android.view.MenuItem
import android.widget.LinearLayout
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
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.navigationdrawer.R
import com.example.navigationdrawer.R.layout.activity_main
import com.example.navigationdrawer.ui.theme.NavigationDrawerTheme
class MainActivity : ComponentActivity() {
    lateinit var drawerLayout: DrawerLayout
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle


    private fun ActionBarDrawerToggle(mainActivity: MainActivity): ActionBarDrawerToggle {
        TODO("Not yet implemented")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        drawerLayout=findViewById(drawerLayout)
        actionBarDrawerToggle=ActionBarDrawerToggle(this) drawerLayout  R.string.nav_open

    }




    }






