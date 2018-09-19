package com.example.logonrmlocal.meusjogos.listajogos

import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.logonrmlocal.meusjogos.model.Jogo
import kotlinx.android.synthetic.main.meus_jogos_item.view.*

class JogoViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

    fun bindView(jogo: Jogo,
                 Listener: (Jogo) -> Unit) = with(itemView){
        tvTitulo.text = jogo.titulo
        tvAno.text = jogo.ano.toString()
        ivJogo.setImageDrawable(
                ContextCompat.getDrawable(itemView.context,
                        jogo.resourceId)
        )
        tvDesc.text = jogo.descricao

        setOnClickListener{ Listener(jogo) }
    }

}