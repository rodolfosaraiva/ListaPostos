package br.fib.android.listas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class PostoAdapter(context: Context, lista: Array<Posto>) : BaseAdapter() {

    private var listaPostos: Array<Posto>
    private var inflator: LayoutInflater

    init {
        this.listaPostos = lista
        this.inflator = LayoutInflater.from(context)
    }

    override fun getCount(): Int {
        return this.listaPostos.size
    }

    override fun getItem(position: Int): Any? {
        return this.listaPostos.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        val posto = this.listaPostos.get(position)
        val view = this.inflator.inflate(R.layout.linha, parent, false)
        (view.findViewById<TextView>(R.id.nome)).text = posto.nome
        (view.findViewById<TextView>(R.id.precoAlcool)).text = posto.precoAlcool.toString()
        (view.findViewById<TextView>(R.id.precoGasolina)).text = posto.precoGasolina.toString()
        return view
    }

}
