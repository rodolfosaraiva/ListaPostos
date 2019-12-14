package br.fib.android.listas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = PostoAdapter(applicationContext, postos)

        var lista = findViewById(R.id.lstpostos) as ListView
        lista.adapter = adapter


        lista.setOnItemClickListener {parent, view, position, id ->
            val intent = Intent(this@MainActivity, telaResultado::class.java)
            intent.putExtra("posto", postos[position])
            startActivity(intent)
        }
    }

    companion object {
        internal val postos = arrayOf(
            Posto("Posto do Rodolfo", 4.15, 3.05),
            Posto("Posto 1", 4.25, 3.10),
            Posto("Posto 2", 4.00, 1.80),
            Posto("Posto 3", 3.00, 4.25)
        )
    }
}
