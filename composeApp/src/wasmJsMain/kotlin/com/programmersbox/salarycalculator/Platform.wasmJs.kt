package com.programmersbox.salarycalculator

import kotlin.math.roundToInt

class WasmPlatform : Platform {
    override val name: String = "Web with Kotlin/Wasm"
}

actual fun getPlatform(): Platform = WasmPlatform()

actual fun Double.formatCurrency(): String {
    var decimal = toString().takeLast(2)
    if (decimal == "00") decimal = "0"
    val rest = roundToInt()
        .toString()
        .reversed()
        .chunked(3)
        .joinToString(",")
        .reversed()
    return "$$rest.$decimal".replace("..", ".")
}