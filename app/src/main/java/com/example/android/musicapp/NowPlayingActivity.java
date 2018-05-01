package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        //grab the views where we are going to set the info from the intent
        TextView now_playing_info_title = (TextView)findViewById(R.id.now_playing_title);
        TextView now_playing_info_artist = (TextView)findViewById(R.id.now_playing_artist);
        ImageView now_playing_info_image = (ImageView) findViewById(R.id.now_playing_image);

        //get info from the intent and set them on the selected views
        now_playing_info_title.setText(getIntent().getStringExtra("title"));
        now_playing_info_artist.setText(getIntent().getStringExtra("artist"));
        //getIntExtra takes a second parameter which is the default image
        now_playing_info_image.setImageResource(getIntent().getIntExtra("image", R.drawable.bluehorn ));

    }
}
