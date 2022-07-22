package com.example.dicesix

class NumeroDaSorte(private val NumeroDeLadosPresentes: Int) {
    fun NumeroAleatorio(): Int {
        return (1..NumeroDeLadosPresentes).random()
    }
}