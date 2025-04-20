package ru.normno.mykoincontextbinding

import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

actual val targetModule: Module = module {
    single<Platform> { Platform(androidContext()) }
}