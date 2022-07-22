package com.example.dicesix

class Dado(private val NumeroDeLados: Int) {
    fun jogar(): Int {
        return (1..NumeroDeLados).random()
    }
}