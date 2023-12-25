package com.example.topgames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1- AdapterView : CardView
        val recyclerview : RecyclerView = findViewById(R.id.recyclerview)
        recyclerview.layoutManager =
            LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        // 2- Data Source : List of Game Objects
        val gameList: ArrayList<GameModel> = ArrayList()
        val g1 = GameModel(R.drawable.h,"Horizon Race")
        val g2 = GameModel(R.drawable.h1,"Subway Surfers")
        val g3 = GameModel(R.drawable.h2,"Mario")
        val g4 = GameModel(R.drawable.h3,"Temple Run")
        val g5 = GameModel(R.drawable.h4,"Candy Crush Saga")
        val g6 = GameModel(R.drawable.h5,"PUBG")

        gameList.add(g1)
        gameList.add(g2)
        gameList.add(g3)
        gameList.add(g4)
        gameList.add(g5)
        gameList.add(g6)

        // Adapter:
        val adapter =  GameAdapter(gameList)
        recyclerview.adapter = adapter
    }
}