package com.example.androind.myaudio.adaptors;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androind.myaudio.R;
import com.example.androind.myaudio.entity.Song;

import java.util.ArrayList;

/**
 * Created by ammar_saaddine on 03.03.18.
 */

public class SongAdaptor extends ArrayAdapter<Song> {

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.songs_list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // set singer profile image
        ImageView singerImage = listItemView.findViewById(R.id.singer_image);
        singerImage.setImageResource(currentSong.singer.imageID);

        // set song name
        TextView songNameTextView = listItemView.findViewById(R.id.song_name);
        songNameTextView.setText(currentSong.name);

        // set singer name
        TextView singerNameTextView = listItemView.findViewById(R.id.singer_name);
        singerNameTextView.setText(currentSong.singer.name);

        return listItemView;
    }

    public SongAdaptor(@NonNull Activity context, @NonNull ArrayList<Song> songs) {
        super(context, 0, songs);
    }
}
