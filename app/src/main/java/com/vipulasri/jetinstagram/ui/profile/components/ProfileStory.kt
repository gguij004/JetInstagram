package com.vipulasri.jetinstagram.ui.profile.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vipulasri.jetinstagram.ui.components.diagonalGradientBorder

@Composable
fun ProfileStory() {
    val shape = CircleShape
    Box(
        modifier = Modifier
            .padding(horizontal = 6.dp)
            .diagonalGradientBorder(
                colors = listOf(
                    Color(0xFF000000),
                    Color(0xFF444444)
                ),
                shape = shape,
                isFromRight = true
            )
    ) {
        Box(
            modifier = Modifier
                .size(66.dp)
                .padding(6.dp)
                .background(color = Color.Black, shape = shape)
                .clip(shape)
        )
    }
}
@Preview
@Composable
fun ShowStoryImageProfile(){
    ProfileStory()
}