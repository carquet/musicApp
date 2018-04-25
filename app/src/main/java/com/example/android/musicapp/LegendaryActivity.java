package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class LegendaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legendary);

        //Set content
        ArrayList<String> legendarySongs = new ArrayList<>();
        legendarySongs.add("Born to Be Wild");
        legendarySongs.add("Smooth Criminal");
        legendarySongs.add("My Way");
        legendarySongs.add("New York, New York");
        legendarySongs.add("My blue swede shoes");
        legendarySongs.add("Halleluya");

        //1. create an adapter that loops through the array and put them into a bootstrap list item
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, legendarySongs);

        //2. grab the view
        ListView songListView = (ListView) findViewById(R.id.songView);

        //3. plug the adapter onto the view
        songListView.setAdapter(itemsAdapter);
    }
}
