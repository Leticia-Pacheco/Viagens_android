package com.example.viagens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.viagens.adapter.DestinoRecenteAdapter
import com.example.viagens.model.DestinosRecentes

class MainActivity : AppCompatActivity() {

    lateinit var rvDestinosRecentes: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvDestinosRecentes = findViewById(R.id.rv_destinos_recentes)
        rvDestinosRecentes.layoutManager =
            LinearLayoutManager(
                this,
                LinearLayoutManager.HORIZONTAL,
                false)

        val adapterDestinosRecentes =
            DestinoRecenteAdapter(setListaDestinosRecentes(), this)

        rvDestinosRecentes.adapter = adapterDestinosRecentes
    }

    private fun setListaDestinosRecentes(): List<DestinosRecentes> {
        val lista = listOf(
            DestinosRecentes("Porto de Galinhas", "Pernambuco", "R$ 500,00"),
            DestinosRecentes("Angra dos Reis", "Rio de Janeiro", "R$ 640,00"),
            DestinosRecentes("Florianópolis", "Santa Catarina", "R$ 350,00"),
            DestinosRecentes("Acapulco", "México", "R$ 1.200,00"),
            DestinosRecentes("Paris", "França", "R$ 2.700,00"),
            DestinosRecentes("Milão", "Itália", "R$ 5.000,00"))
        return lista
    }
}