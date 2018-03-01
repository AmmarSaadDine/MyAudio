package com.example.androind.myaudio;

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

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public ArrayList<Singer> getSingers() {
        return singers;
    }

    // Private methods

    // Create the songs list
    private void initData() {

        // Init singers
        singers = new ArrayList<>();

        Singer drake = new Singer("Drake", null);
        singers.add(drake);
        Singer edSheeran = new Singer("Ed Sheeran", null);
        singers.add(edSheeran);
        Singer camilaCabello = new Singer("Camila Cabello", null);
        singers.add(camilaCabello);
        Singer postMalone = new Singer("Post Malone", null);
        singers.add(postMalone);
        Singer migos = new Singer("Migos", null);
        singers.add(migos);
        Singer duaLipa = new Singer("Dua Lipa", null);
        singers.add(duaLipa);
        Singer nf = new Singer("NF", null);
        singers.add(nf);
        Singer imagineDragons = new Singer("Imagine Dragons", null);
        singers.add(imagineDragons);
        Singer halsey = new Singer("Halsey", null);
        singers.add(halsey);
        Singer bazzi = new Singer("Bazzi", null);
        singers.add(bazzi);
        Singer charliePuth = new Singer("Charlie Puth", null);
        singers.add(charliePuth);
        Singer justinTimberlake = new Singer("Justin Timberlake", null);
        singers.add(justinTimberlake);
        Singer eminem = new Singer("Eminem", null);
        singers.add(eminem);
        Singer kaneBrown = new Singer("Kane Brown", null);
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
