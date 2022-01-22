package com.weiting.myworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.weiting.myworkout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.findNavController()

        binding.apply {
            navBottomView.itemIconTintList = null
            navBottomView.setupWithNavController(navController)

            btStartWorkout.imageTintList = null
            btStartWorkout.setOnClickListener {
                navController.navigate(NavigationDirections.actionGlobalWorkoutFragment())
            }
        }
    }
}