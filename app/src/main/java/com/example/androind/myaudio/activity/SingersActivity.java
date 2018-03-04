package com.example.androind.myaudio.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.androind.myaudio.R;
import com.example.androind.myaudio.adaptors.SingerAdaptor;
import com.example.androind.myaudio.entity.DataMock;
import com.example.androind.myaudio.entity.Singer;

import java.util.ArrayList;

public class SingersActivity extends AppCompatActivity {

    /// Array of singers of this activity
    private ArrayList<Singer> singers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singers);

        // get the singers data form the intent
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && !bundle.isEmpty()) {
            if (bundle.containsKey("singers")) {
                singers = bundle.getParcelableArrayList("singers");
            }
        }

        // create singers list adaptor
        SingerAdaptor adaptor = new SingerAdaptor(this, singers);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adaptor);

        // create on item click listener to open the songs activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position < singers.size()) {
                    // get selected singer
                    Singer selectedSinger = singers.get(position);

                    // open songs activity for the selected singer
                    Intent intent = new Intent(SingersActivity.this, SongsActivity.class);
                    intent.putParcelableArrayListExtra("songs", DataMock.getInstance().getSongs(selectedSinger));
                    startActivity(intent);
                }
            }
        });
    }
}
