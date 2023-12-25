package com.example.topgames

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class GameAdapter (private val gameList: ArrayList<GameModel>): RecyclerView.Adapter<GameAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        val gameImg: ImageView
        val gameTitle: TextView

        init {
            gameImg = itemView.findViewById(R.id.cardviewImg)
            gameTitle = itemView.findViewById(R.id.cardview_text)

           itemView.setOnClickListener {
               Toast.makeText(itemView.context,"You chose: ${gameTitle.text}",Toast.LENGTH_SHORT).show()
           }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_item_layout,parent,false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
      return gameList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.gameImg.setImageResource(gameList[position].imgCard)
        holder.gameTitle.text = gameList[position].textCard
    }
}