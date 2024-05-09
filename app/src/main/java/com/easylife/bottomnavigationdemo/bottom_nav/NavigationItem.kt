package com.easylife.bottomnavigationdemo.bottom_nav

import com.easylife.bottomnavigationdemo.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    data object Home : NavigationItem("home", R.drawable.ic_home, "Home")
    data object Music : NavigationItem("music", R.drawable.ic_music, "Music")
    data object Movies : NavigationItem("movies", R.drawable.ic_movie, "Movies")
}