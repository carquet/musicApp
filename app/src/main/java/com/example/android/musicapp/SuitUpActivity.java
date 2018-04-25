package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SuitUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suit_up);

        //create content - put it in a an ArraysList
        ArrayList<String> suitUpSongs = new ArrayList<>();
        suitUpSongs.add("It's been a hard day work");
        suitUpSongs.add("Sonata piano");
        suitUpSongs.add("Hoy no me quiero levantar");
        suitUpSongs.add("I am no Superman");
        suitUpSongs.add("Le travail c'est la santé");
        suitUpSongs.add("Who's the boss");
        suitUpSongs.add("Confident");

        //1. create an adapter that loops through the array and put them into a bootstrap list item
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, suitUpSongs);

        //2. grab the view
        ListView songListView = (ListView) findViewById(R.id.songView);

        //3. plug the adapter onto the view
        songListView.setAdapter(itemsAdapter);
    }
}
