package com.example.dicesix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Button
        val jogarDado: Button = findViewById(R.id.button)
        jogarDado.setOnClickListener {

            //Dado
            val dado = Dado(6)
            val dadoJogado = dado.jogar()
            val imagemDoDado: ImageView = findViewById(R.id.imageView)

            //Sort Number
            val numero = NumeroDaSorte(6)
            val numeroSorteado = numero.NumeroAleatorio()

            //Correct Image
            when (dadoJogado) {
                1 -> imagemDoDado.setImageResource(R.drawable.dice_1)
                2 -> imagemDoDado.setImageResource(R.drawable.dice_2)
                3 -> imagemDoDado.setImageResource(R.drawable.dice_3)
                4 -> imagemDoDado.setImageResource(R.drawable.dice_4)
                5 -> imagemDoDado.setImageResource(R.drawable.dice_5)
                6 -> imagemDoDado.setImageResource(R.drawable.dice_6)
            }

            //Condition to Win
            if (dadoJogado == numeroSorteado) {
                Toast.makeText(this, "Parabéns!!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Tente Novamente! O número da sorte era ${numeroSorteado}!", Toast.LENGTH_LONG).show()
            }

        }
    }
}


