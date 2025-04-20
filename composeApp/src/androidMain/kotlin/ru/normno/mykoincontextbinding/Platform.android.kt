package ru.normno.mykoincontextbinding

import android.content.Context
import android.os.Build

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class Platform(private val context: Context) {
    actual fun getName(): String {
        return "Android - ${Build.VERSION.SDK_INT} (${context.packageName})"
    }
}