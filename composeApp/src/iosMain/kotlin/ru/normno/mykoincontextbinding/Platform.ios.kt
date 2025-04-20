package ru.normno.mykoincontextbinding

import platform.UIKit.UIDevice

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class Platform() {
    actual fun getName(): String {
        return "iOS - ${UIDevice.currentDevice.systemName}"
    }
}