package com.example.android.musicapp;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songsList) {
        //we initialize the ArrayAdapter's internal storage for the context and the list.
        super(context, 0, songsList);
    }

    /**
     * Provides a view for the Adapter
     *
     * @param position    the position in the list of data that should be displayed in the list view item
     * @param convertView the recycled view to populate
     * @param parent      Viewgroup that is used for inflation
     * @return the View for the position in the AdapterView
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //check if the existing view is being used, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get the @link songsList object located in this position in the list
        Song currentSong = getItem(position);

        //Song album_image, title, artist

        //ALBUM IMAGE
        //Find the textView in the list_item.xml layout with the ID album_image
        ImageView albumTextView = (ImageView) listItemView.findViewById(R.id.album_image);
        albumTextView.setImageResource(currentSong.getmAlbumImage());

        //SONG TITLE
        //Find the textView in the list_item.xml layout with the ID title
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        titleTextView.setText(currentSong.getmTitle());

        //ARTIST NAME
        //Find the textView in the list_item.xml layout with the ID artist
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist);
        artistTextView.setText(currentSong.getmArtist());

        //SONG PLAYED
        int raw = currentSong.getmRawResource();

        return listItemView;
    }
}
