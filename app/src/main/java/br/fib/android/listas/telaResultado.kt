package br.fib.android.listas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.tela_resultado.*

class telaResultado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_resultado)

        Log.i("AULA", "On Create")


        val intent = intent
        if (intent != null) {
            val postoSelecionado = intent.getSerializableExtra("posto") as Posto

            var resultado:String = "";

            if (postoSelecionado.precoGasolina * 0.7 > postoSelecionado.precoAlcool) {
                resultado = "Comprar Alcool"
                Log.i("AULA", "Resultado: Comprar Alcool")
            }
            else {
                resultado = "Comprar Gasolina"
                Log.i("AULA", "Resultado: Comprar Gasolina")
            }

            inputNomePosto.setText(postoSelecionado.nome)
            inputResultado.setText(resultado)
        }

    }
}
