package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
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

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        for(int index = 0; index < blueHornSongs.size(); index++){
            TextView songView = new TextView(this);
            songView.setText(blueHornSongs.get(index));
            rootView.addView(songView);
        }

    }
}
