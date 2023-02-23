package com.vipulasri.jetinstagram.ui.profile

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.vipulasri.jetinstagram.data.PostsRepository
import com.vipulasri.jetinstagram.data.StoriesRepository
import com.vipulasri.jetinstagram.ui.home.Post
import com.vipulasri.jetinstagram.ui.home.StoriesList
import com.vipulasri.jetinstagram.ui.profile.components.*
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ProfileScreen() {
    val scrollState = rememberScrollState()
    val stories by StoriesRepository.observeStories()
    val posts by PostsRepository.posts
    val coroutineScope = rememberCoroutineScope()
    val itemSize: Dp = (LocalConfiguration.current.screenWidthDp.dp / 2)
    Scaffold(
        topBar = { ProfileToolbar() }
    ) {
        LazyColumn {
            item {
                ProfileFollowers()
                Spacer(Modifier.height(12.dp))
                ProfileInfo()
                Spacer(Modifier.height(12.dp))
                StoriesList(stories)
                Divider()
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                ) {
                    Row(
                    ) {
                        posts.forEach { post ->
                            Box(
                                modifier = Modifier
                                    .width(itemSize)
                                    .height(200.dp)
                                    .padding(horizontal = 6.dp)

                            ) {
                                Post(post,
                                    onDoubleClick = {
                                        coroutineScope.launch {
                                            PostsRepository.performLike(post.id)
                                        }
                                    },
                                    onLikeToggle = {
                                        coroutineScope.launch {
                                            PostsRepository.toggleLike(post.id)
                                        }
                                    }
                                )
                            }
                        }
                    }
                }

            }


        }
    }
}


@Preview
@Composable
fun ShowProfileScreen() {
    ProfileScreen()
}

