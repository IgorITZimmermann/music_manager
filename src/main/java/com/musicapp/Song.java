package com.musicapp;

public class Song {
    private String title;
    private String artist;
    private int songDurationInSec;

    public Song(String title, String artist, int songDurationInSec) {
        this.title = title;
        this.artist = artist;
        this.songDurationInSec = songDurationInSec;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongDurationInSec() {
        return songDurationInSec;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", durationInSec=" + songDurationInSec +
                '}';
    }
}
