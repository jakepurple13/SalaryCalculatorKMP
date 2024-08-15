package com.programmersbox.salarycalculator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

expect fun Double.formatCurrency(): String