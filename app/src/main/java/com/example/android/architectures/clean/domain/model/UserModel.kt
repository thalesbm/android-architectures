package com.example.android.architectures.clean.domain.model

data class UserModel(
    val id: Long,
    val name: String,
    val surname: String,
    val email: String,
    val age: Int
)
