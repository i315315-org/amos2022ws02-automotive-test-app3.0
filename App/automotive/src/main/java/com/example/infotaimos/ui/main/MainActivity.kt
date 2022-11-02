package com.example.infotaimos.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.infotaimos.R

class MainActivity : AppCompatActivity() {

    private lateinit var navContoller: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navContoller = navHostFragment.navController

        // Set up the action bar for use with the NavController
        setupActionBarWithNavController(navContoller)
    }

    /**
     * Handle navigation when the user chooses Up from the action bar.
     */
    override fun onSupportNavigateUp(): Boolean {
        return navContoller.navigateUp() || super.onSupportNavigateUp()
    }
}