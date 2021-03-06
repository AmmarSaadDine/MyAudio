package com.example.androind.myaudio.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.androind.myaudio.R;
import com.example.androind.myaudio.entity.DataMock;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        // setup all songs button on click event
        ImageButton allSongsButton = findViewById(R.id.songs_button);
        allSongsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LibraryActivity.this, SongsActivity.class);
                intent.putParcelableArrayListExtra("songs", DataMock.getInstance().getSongs());
                startActivity(intent);
            }
        });

        // setup all singers button on click event
        ImageButton singersButton = findViewById(R.id.singers_button);
        singersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LibraryActivity.this, SingersActivity.class);
                intent.putParcelableArrayListExtra("singers", DataMock.getInstance().getSingers());
                startActivity(intent);
            }
        });
    }
}
