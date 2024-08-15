package com.programmersbox.salarycalculator

import android.os.Build
import java.text.NumberFormat

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()

private val numberFormatter = NumberFormat.getCurrencyInstance()

actual fun Double.formatCurrency(): String = numberFormatter.format(this)
