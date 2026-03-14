package com.example.justhabits

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform