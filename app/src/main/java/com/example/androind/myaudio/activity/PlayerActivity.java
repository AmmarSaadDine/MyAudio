package com.example.androind.myaudio.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androind.myaudio.R;
import com.example.androind.myaudio.entity.Song;

public class PlayerActivity extends AppCompatActivity {

    private Song selectedSong = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        // get the selected song data form the intent
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && !bundle.isEmpty()) {
            if (bundle.containsKey("selectedSong")) {
                selectedSong = bundle.getParcelable("selectedSong");
                updateView();
            }
        }
    }

    // Private methdos

    private void updateView() {
        if (selectedSong != null) {
            // set the singer image
            ImageView singerImageView = findViewById(R.id.singer_image);
            singerImageView.setImageResource(selectedSong.singer.imageID);

            // set the singer name
            TextView singerNametextView = findViewById(R.id.singer_name);
            singerNametextView.setText(selectedSong.singer.name);

            // set the song name
            TextView songNametextView = findViewById(R.id.song_name);
            songNametextView.setText(selectedSong.name);
        }
    }
}
