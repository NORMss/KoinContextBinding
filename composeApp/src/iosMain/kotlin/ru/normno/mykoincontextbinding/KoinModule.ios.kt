package ru.normno.mykoincontextbinding

import org.koin.dsl.module

actual val targetModule = module {
    single<Platform> { Platform() }
}