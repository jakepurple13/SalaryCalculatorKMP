package com.programmersbox.salarycalculator

import java.text.NumberFormat

class JVMPlatform: Platform {
    override val name: String = "Java ${System.getProperty("java.version")}"
}

actual fun getPlatform(): Platform = JVMPlatform()

private val numberFormatter = NumberFormat.getCurrencyInstance()

actual fun Double.formatCurrency(): String = numberFormatter.format(this)