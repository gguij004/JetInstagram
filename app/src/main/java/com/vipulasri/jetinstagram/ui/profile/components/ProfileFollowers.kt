package com.vipulasri.jetinstagram.ui.profile.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vipulasri.jetinstagram.R

//Building the Followers section
@Composable
fun ProfileFollowers() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        ProfilePicture()
        Column {
            PostAndFollowersRow()
            Row(
                modifier = Modifier.height(35.dp)
            ) {
                FollowButton()
                Spacer(Modifier.fillMaxWidth(0.1F))
                DropDowButton()
            }
        }
    }
}

//Building the profile picture
@Composable
fun ProfilePicture() {
    val shape = CircleShape
    Box(
        modifier = Modifier
            .size(66.dp)
            .background(color = Color.Black, shape = shape)
            .clip(shape)
    ) {
        Text(
            text = "PU", color = Color.White,
            fontSize = 25.sp,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

//Building Follow Button
@Composable
fun PostAndFollowersRow(){
    Row (modifier = Modifier
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "371")
            Text(text = "Posts")
        }
        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = "14.4K")
            Text(text = "followers")
        }
        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "272")
            Text(text = "following")
        }
    }
}


@Composable
fun FollowButton(){
        Button(onClick = {},
            modifier = Modifier.fillMaxWidth(0.8F),
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.blue_king))
        ){
            Text("Follow")
        }
}

@Composable
fun DropDowButton(){
        Button(onClick = {},
            modifier = Modifier.fillMaxWidth(2F),
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.blue_king))
        ){
            Icon(Icons.Rounded.Menu, contentDescription = "Localized description")
        }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
private fun ShowProfileFollowers() {
    ProfileFollowers()
}