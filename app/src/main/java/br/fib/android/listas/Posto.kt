package br.fib.android.listas

import java.io.Serializable

data class Posto(
    var nome: String,
    var precoGasolina: Double,
    var precoAlcool: Double) : Serializable {

    override fun toString(): String {
        return nome.toString()
    }
}
