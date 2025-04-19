package ru.normno.mykoincontextbinding

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform