package com.kaanduzbastilar.testintro

class Tax {

    //TDD - Test Driven Development

    fun calculateTax(grossIncome : Double, taxRate : Double): Double {
        return grossIncome * taxRate
    }
    fun calculateIncome(grossIncome: Double, taxRate: Double): Double {
        return grossIncome - (grossIncome * taxRate)
    }
}