package com.vipulasri.jetinstagram.ui.profile.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vipulasri.jetinstagram.R
import com.vipulasri.jetinstagram.ui.components.icon

@Composable
fun ProfileToolbar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .padding(horizontal = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            Icons.Rounded.ArrowBack,
            modifier = Modifier.icon(),
            contentDescription = ""
        )
        Text(text = "Putarraca")

        Icon(
            painter = painterResource(R.drawable.ic_more),
            modifier = Modifier.icon(),
            contentDescription = ""
        )
    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
private fun ShowProfileToolbar() {
    ProfileToolbar()
}
