package com.example.habobcaffee

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform