package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
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

        //grab the root view
        LinearLayout root = (LinearLayout) findViewById(R.id.rootView);

        //populate it with the content you created
        for(int index = 0; index < suitUpSongs.size();index++){
            TextView songView = new TextView(this);
            songView.setText(suitUpSongs.get(index));
            root.addView(songView);

        }
    }
}
