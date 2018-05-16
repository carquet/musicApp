package com.example.android.musicapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
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

        final ArrayList<Song> songsList = new ArrayList<>();
        songsList.add(new Song(R.drawable.album, "Someone like you", "Adèle", R.raw.song_four));
        songsList.add(new Song(R.drawable.album, "Say Something", "A great Big World", R.raw.song_two));
        songsList.add(new Song(R.drawable.album, "Everybody hurts", "R.E.M", R.raw.song_three));
        songsList.add(new Song(R.drawable.album, "Nothing Compared To You", "Senead O´Connor", R.raw.song_one));
        songsList.add(new Song(R.drawable.album, "Pink Floyd", "Wish you were here", R.raw.song_five));

        //1. create an adapter that loops through the array and put them into a bootstrap list item
        SongAdapter itemsAdapter = new SongAdapter(this, songsList);

        //2. grab the view
        ListView songListView = (ListView) findViewById(R.id.songView);

        //3. plug the adapter onto the view
        songListView.setAdapter(itemsAdapter);

        //Set item click listener on each item
        /*
        AdapterView: The AdapterView where the click happened
        View: The view within the AdapterView that was clicked (this will be a view provided by the adapter)
        int: The position of the view in the adapter.
        long: The row id of the item that was clicked.
         */
        songListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int position, long id) {

                Song currentSong = songsList.get(position);
                String artist = currentSong.getmArtist();
                String title = currentSong.getmTitle();
                int raw = currentSong.getmRawResource();
                int image = currentSong.getmAlbumImage();

                Intent listViewIntent = new Intent(BlueHornActivity.this, NowPlayingActivity.class);
                listViewIntent.putExtra("artist", artist);
                listViewIntent.putExtra("title", title);
                listViewIntent.putExtra("image", image);
                listViewIntent.putExtra("raw", raw);
                startActivity(listViewIntent);

            }

        });
    }

}
