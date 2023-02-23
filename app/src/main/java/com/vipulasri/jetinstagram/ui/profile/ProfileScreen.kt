package com.vipulasri.jetinstagram.ui.profile

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vipulasri.jetinstagram.data.PostsRepository
import com.vipulasri.jetinstagram.data.StoriesRepository
import com.vipulasri.jetinstagram.model.Post
import com.vipulasri.jetinstagram.ui.home.Post
import com.vipulasri.jetinstagram.ui.home.StoriesList
import com.vipulasri.jetinstagram.ui.profile.components.*
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ProfileScreen(){
    val scrollState = rememberScrollState()
    val stories by StoriesRepository.observeStories()
    val posts by PostsRepository.posts
    val coroutineScope = rememberCoroutineScope()
    Scaffold(
        topBar = {ProfileToolbar()}
    ) {
        LazyColumn{
            item {
                ProfileFollowers()
                Spacer(Modifier.height(12.dp))
                ProfileInfo()
                Spacer(Modifier.height(12.dp))
                StoriesList(stories)
                Divider()
        }
       // ProfilePosts()
    }
}}


@Preview
@Composable
fun ShowProfileScreen(){
    ProfileScreen()
}