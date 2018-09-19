package com.example.logonrmlocal.meusjogos.listajogos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import android.widget.Toast
import com.example.logonrmlocal.meusjogos.R
import com.example.logonrmlocal.meusjogos.detalhejogo.DetalheActivity
import com.example.logonrmlocal.meusjogos.model.Jogo
import kotlinx.android.synthetic.main.activity_lista_jogos.*

class ListaJogosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_jogos)

        rvJogos.adapter = JogosAdapter(this, getJogos(), {jogo ->
            val detalheIntent = Intent(this, DetalheActivity::class.java)
            detalheIntent.putExtra("TITULO", jogo.titulo)
            detalheIntent.putExtra("JOGO", jogo)
            startActivity(detalheIntent)
        })

        rvJogos.layoutManager = LinearLayoutManager(this)
    }

    private fun getJogos(): List<Jogo> {
        return listOf(
        Jogo(R.drawable.spider_man, "Spiderman", 2018, "Eu sou o Batman"),
        Jogo(R.drawable.spider_man, "Spiderman", 2018, "Eu sou o Batman"),
        Jogo(R.drawable.god_of_war, "God of War IV", 2016, "Não Infomadada"),
        Jogo(R.drawable.god_of_war, "God of War IV", 2016, "Não Infomadada"),
        Jogo(R.drawable.resident_evil, "Resident Evil", 2011, "Não Informada"),
        Jogo(R.drawable.resident_evil, "Resident Evil", 2011, "Não Informada"),
        Jogo(R.drawable.super_mario, "Super Mario World", 2012, "Informada porque eu quis")
        )
    }

}
