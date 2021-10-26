package com.example.kotlinnavigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.kotlinnavigationdrawer.databinding.ActivityMainBinding
import com.example.kotlinnavigationdrawer.databinding.FragmentUsersBinding

class MainActivity : AppCompatActivity() {
    //Tutorial: https://youtu.be/yK9blYd13Zo
    private lateinit var navController : NavController
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Setear toolbar
        setSupportActionBar(binding.toolbar)

        // Inicializar el navController pasandole nuestro navHostFragment
        navController = Navigation.findNavController(this, R.id.my_nav_host_fragment)

        //Setear navigationView a este navController
        NavigationUI.setupWithNavController(binding.navigationView, navController)

        //Desplegar el titulo del fragment seleccionado al toolbar
        NavigationUI.setupActionBarWithNavController(this,navController, binding.drawerLayout)

    }

    //sobre-escribir algunos metodos para manejar el back-button

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(
            navController,
            binding.drawerLayout
        )
    }




}