package com.example.topgamescardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // 1 - Data
    ArrayList<GameModel> gamesList;

    // 2 - ArrayAdapter (RecyclerView)
    RecyclerView recyclerView;

    // 3 - Adapter
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        gamesList = new ArrayList<>();
        gamesList.add(new GameModel("Call Of Duty", R.drawable.call_of_duty));
        gamesList.add(new GameModel("Fortnite", R.drawable.fornite));
        gamesList.add(new GameModel("God Of War", R.drawable.god_of_war));
        gamesList.add(new GameModel("Grand Theft Auto", R.drawable.grand_theft_auto_5));
        gamesList.add(new GameModel("Mine Craft", R.drawable.minecraft));
        gamesList.add(new GameModel("Need For Speed", R.drawable.need_for_speed));

        adapter = new MyAdapter(this,gamesList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}