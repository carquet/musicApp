package com.example.android.musicapp;

import android.content.Context;
import android.media.Image;

public class Song {
    //url of album image
    private int mAlbumResourceId;
    //title of the song
    private String mTitle;
    //name of the artist
    private String mArtist;
    //raw resource for the song
    private int mRawResource;


    /**
     * @param Album  is the id of the resource
     * @param title  is the title of the song
     * @param artist is the name of the artist
     */
    public Song(int Album, String title, String artist) {

        mAlbumResourceId = Album;
        mTitle = title;
        mArtist = artist;

    }

    public Song(int Album, String title, String artist, int rawResource) {

        mAlbumResourceId = Album;
        mTitle = title;
        mArtist = artist;
        mRawResource = rawResource;

    }

    public int getmAlbumImage() {
        return mAlbumResourceId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmArtist() {
        return mArtist;
    }

    public int getmRawResource(){
        return mRawResource;
    }

}
