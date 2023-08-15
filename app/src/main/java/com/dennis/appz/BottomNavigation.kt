package com.dennis.appz

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BottomMenu(){
BottomNav()
}

@Composable
fun BottomNav() {
    val bottomNavItems = listOf(
        BottomNavItem(name = "Home", route = "home", icon = Icons.Rounded.Home),
        BottomNavItem(name = "Create", route = "add", icon = Icons.Rounded.AddCircle),
        BottomNavItem(name = "Settings", route = "settings", icon = Icons.Rounded.Settings)
    )


    var selectedItem by remember {
        mutableStateOf(0)
    }



    NavigationBar(
        modifier = Modifier.fillMaxWidth(),
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = Color.White,

        ) {
        bottomNavItems.forEachIndexed { index, item ->

            NavigationBarItem(
                selected = selectedItem == index,
                onClick = {
                selectedItem = index
                },
                label = {
                    Text(text = item.name, fontWeight = FontWeight.SemiBold)

                },
                icon = {
                    Icon(imageVector = item.icon, contentDescription ="${item.name} Icon" )
                }

                )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun BottomMenuPreview(){
    BottomMenu()
}