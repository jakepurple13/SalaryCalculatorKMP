package com.programmersbox.salarycalculator

class WasmPlatform: Platform {
    override val name: String = "Web with Kotlin/Wasm"
}

actual fun getPlatform(): Platform = WasmPlatform()

actual fun Double.formatCurrency(): String = this.asDynamic().toFixed(2)