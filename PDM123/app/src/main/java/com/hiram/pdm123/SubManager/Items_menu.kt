package com.hiram.pdm123.SubManager

import com.hiram.pdm123.R

sealed class Items_menu(
    val icon: Int,
    val title : String,
    val ruta: String
){
    object screen_search: Items_menu(R.drawable.busqueda, "Busqueda", "screen_busqueda")
    object screen_home: Items_menu(R.drawable.home, "Home", "screen_home")
    object screen_finance: Items_menu(R.drawable.finanzas, "Finanzas", "screen_finance")
}
//Terminamos el exame Orvil e Hiram