package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class BlueHornActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue_horn);

        ArrayList<String> blueHornSongs = new ArrayList<>();
        blueHornSongs.add("Someone like you");
        blueHornSongs.add("Say something");
        blueHornSongs.add("Everybody Hurts");
        blueHornSongs.add("Nothing Compares 2 U");
        blueHornSongs.add("Say Something");
        blueHornSongs.add("Angels");
        blueHornSongs.add("Wish You Were Here");
        blueHornSongs.add("Time After Time");

        //1. create an adapter that loops through the array and put them into a bootstrap list item
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, blueHornSongs);

        //2. grab the view
        ListView songListView = (ListView) findViewById(R.id.songView);

        //3. plug the adapter onto the view
        songListView.setAdapter(itemsAdapter);
    }
}
