package com.vipulasri.jetinstagram.ui.profile.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfileInfo() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp)
    ) {
        Text(text = "Unblast", fontWeight = FontWeight.Bold)
        Text(text = "E-comerce Website", color = Color.LightGray)
        Text(text = "Selective free resources for designers @unblast.")
        Text(text = "Melbourne, Victoria, Australia")
    }
}
@Preview
@Composable
fun ShowProfileInfo(){
    ProfileInfo()
}