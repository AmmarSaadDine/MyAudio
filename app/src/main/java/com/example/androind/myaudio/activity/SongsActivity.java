package com.example.androind.myaudio.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.androind.myaudio.R;
import com.example.androind.myaudio.adaptors.SongAdaptor;
import com.example.androind.myaudio.entity.DataMock;
import com.example.androind.myaudio.entity.Song;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    /// Array of songs of this activity
    private ArrayList<Song> songs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // get the songs data form the intent
        Bundle bundle = getIntent().getExtras();
        if (!bundle.isEmpty()) {
            if (bundle.containsKey("songs")) {
                songs = bundle.getParcelableArrayList("songs");
            }
        }

        //create list adaptor
        SongAdaptor adapter = new SongAdaptor(this, songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
