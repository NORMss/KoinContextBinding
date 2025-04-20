package ru.normno.mykoincontextbinding

import org.koin.core.module.Module
import org.koin.dsl.module

actual val targetModule = module {
    single<Platform> { getPlatform() }
}