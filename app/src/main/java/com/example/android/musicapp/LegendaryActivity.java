package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
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

        LinearLayout root = (LinearLayout) findViewById(R.id.rootView);
        for(int index = 0; index < legendarySongs.size(); index++){
            TextView songView = new TextView(this);
            songView.setText(legendarySongs.get(index));
            root.addView(songView);
        }
    }
}
