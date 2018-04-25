package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class YellowUmbrellaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yellow_umbrella);

        ArrayList<String> yellowUmbrellaSongs = new ArrayList<>();
        yellowUmbrellaSongs.add("I will always love you");
        yellowUmbrellaSongs.add("My heart will go on");
        yellowUmbrellaSongs.add("Unforgettable");
        yellowUmbrellaSongs.add("You're the one that I want");
        yellowUmbrellaSongs.add("I've been loving you");

        //1. create an adapter that loops through the array and put them into a bootstrap list item
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, yellowUmbrellaSongs);

        //2. grab the view
        ListView songListView = (ListView) findViewById(R.id.songView);

        //3. plug the adapter onto the view
        songListView.setAdapter(itemsAdapter);
    }
}
