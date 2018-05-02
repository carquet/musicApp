package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        final ArrayList<Song> songsList = new ArrayList<>();
        songsList.add(new Song(R.drawable.album, "I will always love you", "Whitney Huston"));
        songsList.add(new Song(R.drawable.album, "My heart will go on", "Céline Dion"));
        songsList.add(new Song(R.drawable.album, "Unforgettable", "Nat King Cole"));
        songsList.add(new Song(R.drawable.album, "You're the one that I want", "Grease"));
        songsList.add(new Song(R.drawable.album, "I've been loving you", "Otis Redding"));
        songsList.add(new Song(R.drawable.album, "Hymne à l'amour", "Edith Piaf"));
        songsList.add(new Song(R.drawable.album, "La déclaration d'amour", "France Gall"));

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
                int image = currentSong.getmAlbumImage();

                Intent listViewIntent = new Intent(YellowUmbrellaActivity.this, NowPlayingActivity.class);
                listViewIntent.putExtra("artist", artist);
                listViewIntent.putExtra("title", title);
                listViewIntent.putExtra("image", image);
                startActivity(listViewIntent);

            }
        });
    }
}
