package com.programmersbox.salarycalculator

import platform.Foundation.NSNumber
import platform.Foundation.NSNumberFormatter
import platform.Foundation.NSNumberFormatterCurrencyStyle
import platform.UIKit.UIDevice


class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()

private val numberFormatter = NSNumberFormatter().apply {
    this.numberStyle = NSNumberFormatterCurrencyStyle
}

actual fun Double.formatCurrency(): String = numberFormatter.stringFromNumber(NSNumber(this))!!