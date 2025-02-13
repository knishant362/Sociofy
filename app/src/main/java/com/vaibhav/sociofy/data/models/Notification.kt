package com.vaibhav.sociofy.data.models

data class Notification(
    val uid: String = "",
    val postId: String = "",
    val postImg: String = "",
    val profilePic: String = "",
    val username: String = "",
    val timestamp: Long = System.currentTimeMillis()
)