package com.example.ninjagold.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var bankTotalAmount: Int = 0

    fun getBankTotalString(): String {
        return "$${bankTotalAmount.toString()}"
    }

    fun work() {
        bankTotalAmount += 10
    }

    fun gamble() {
        val isLoss = (0..1).random()
        val amount: Int = (1..50).random()

        if (isLoss > 0) {
            bankTotalAmount += amount
        } else {
            bankTotalAmount -= amount
        }

    }
}
