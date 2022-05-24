package com.aldimas.weatherapp.data.utils

import java.math.RoundingMode

object HelperFunction {

    fun formatterDegree(temperature : Double?): String {
        val maxTemp = temperature as Double
        val tempToCelcius = maxTemp - 273.0
        val formatDegree = tempToCelcius.toBigDecimal().setScale(2,RoundingMode.CEILING)
        return "$formatDegree ℃"

    }
}