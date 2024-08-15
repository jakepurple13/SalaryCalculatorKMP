package com.programmersbox.salarycalculator

class WasmPlatform: Platform {
    override val name: String = "Web with Kotlin/Wasm"
}

actual fun getPlatform(): Platform = WasmPlatform()

private val numberFormatter = NumberFormat.getCurrencyInstance()

actual fun Double.formatCurrency(): String = numberFormatter.format(this)