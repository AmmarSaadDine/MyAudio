package com.example.androind.myaudio.entity;

import com.example.androind.myaudio.R;

import java.util.ArrayList;

/**
 * Created by ammar_saaddine on 28.02.18.
 */

/// This class is to mock the data songs

public class DataMock {

    // Private properties

    // The shared instance of this class
    private static DataMock instance = null;

    private ArrayList<Singer> singers = null;
    private ArrayList<Song> songs = null;


    // Constructors
    // private because it's a singleton
    private DataMock() {
        initData();
    }

    // Public methods

    public static DataMock getInstance() {
        if (instance == null) {
            instance = new DataMock();
        }
        return instance;
    }

    // Returns all songs
    public ArrayList<Song> getSongs() {
        return songs;
    }

    /// Returns all singers
    public ArrayList<Singer> getSingers() {
        return singers;
    }

    /// Returns the songs of a specific singer
    public ArrayList<Song> getSongs(Singer singer) {
        ArrayList<Song> filteredSongs = new ArrayList<>();
        for (Song song : getSongs()) {
            if (song.singer.equals(singer)) {
                filteredSongs.add(song);
            }
        }
        return filteredSongs;
    }

    // Private methods

    // Create the songs list
    private void initData() {

        // Init singers
        singers = new ArrayList<>();

        Singer drake = new Singer("Drake", R.drawable.drake);
        singers.add(drake);
        Singer edSheeran = new Singer("Ed Sheeran", R.drawable.ed_sheeran);
        singers.add(edSheeran);
        Singer camilaCabello = new Singer("Camila Cabello", R.drawable.camila_cabello);
        singers.add(camilaCabello);
        Singer postMalone = new Singer("Post Malone", R.drawable.post_malone);
        singers.add(postMalone);
        Singer migos = new Singer("Migos", R.drawable.migos);
        singers.add(migos);
        Singer duaLipa = new Singer("Dua Lipa", R.drawable.dua_lipa);
        singers.add(duaLipa);
        Singer nf = new Singer("NF", R.drawable.nf);
        singers.add(nf);
        Singer imagineDragons = new Singer("Imagine Dragons", R.drawable.imagine_dragons);
        singers.add(imagineDragons);
        Singer halsey = new Singer("Halsey", R.drawable.halsey);
        singers.add(halsey);
        Singer bazzi = new Singer("Bazzi", R.drawable.bazzi);
        singers.add(bazzi);
        Singer charliePuth = new Singer("Charlie Puth", R.drawable.charlie_puth);
        singers.add(charliePuth);
        Singer justinTimberlake = new Singer("Justin Timberlake", R.drawable.justin_timberlake);
        singers.add(justinTimberlake);
        Singer eminem = new Singer("Eminem", R.drawable.eminem);
        singers.add(eminem);
        Singer kaneBrown = new Singer("Kane Brown", R.drawable.kane_brown);
        singers.add(kaneBrown);

        // Init songs
        songs = new ArrayList<>();
        songs.add(new Song("God's Plan", drake));
        songs.add(new Song("Perfect", edSheeran));
        songs.add(new Song("Havana", camilaCabello));
        songs.add(new Song("Rockstar", postMalone));
        songs.add(new Song("Stir Fry", migos));
        songs.add(new Song("New Rules", duaLipa));
        songs.add(new Song("Let You Down", nf));
        songs.add(new Song("Thunder", imagineDragons));
        songs.add(new Song("Bad At Love", halsey));
        songs.add(new Song("Mine", bazzi));
        songs.add(new Song("I Fall Apart", postMalone));
        songs.add(new Song("How Long", charliePuth));
        songs.add(new Song("Shape Of You", edSheeran));
        songs.add(new Song("Never Be The Same", camilaCabello));
        songs.add(new Song("Say Something", justinTimberlake));
        songs.add(new Song("River", eminem));
        songs.add(new Song("Walk It Talk It", migos));
        songs.add(new Song("Whatever It Takes", imagineDragons));
        songs.add(new Song("Narcos", migos));
        songs.add(new Song("Heaven", kaneBrown));
    }
}
