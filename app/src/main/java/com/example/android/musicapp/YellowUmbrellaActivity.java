package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
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

        LinearLayout root = (LinearLayout) findViewById(R.id.rootView);

        for(int index = 0; index < yellowUmbrellaSongs.size(); index++){
            TextView songView = new TextView(this);
            songView.setText(yellowUmbrellaSongs.get(index));
            root.addView(songView);
        }
    }
}
