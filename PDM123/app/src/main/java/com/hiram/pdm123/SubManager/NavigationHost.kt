package com.hiram.pdm123.SubManager

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.hiram.pdm123.SubManager.Items_menu.*

@Composable
fun NavigationHost(navController: NavHostController){
    NavHost(navController = navController,
        startDestination = screen_home.ruta,
        ){
        composable(screen_home.ruta){
            Home()
        }
        composable(screen_finance.ruta){
            Finance()
        }
        composable(screen_search.ruta){
            Search()
        }
    }
}