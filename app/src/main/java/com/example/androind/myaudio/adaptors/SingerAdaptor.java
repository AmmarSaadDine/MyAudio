package com.example.androind.myaudio.adaptors;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androind.myaudio.R;
import com.example.androind.myaudio.entity.Singer;
import com.example.androind.myaudio.entity.Song;

import java.util.ArrayList;

/**
 * Created by ammar_saaddine on 03.03.18.
 */

public class SingerAdaptor extends ArrayAdapter<Singer> {

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.singers_list_item, parent, false);
        }

        // Get the {@link Singer} object located at this position in the list
        Singer currentSinger = getItem(position);

        // set singer profile image
        ImageView singerImage = listItemView.findViewById(R.id.singer_image);
        singerImage.setImageResource(currentSinger.imageID);

        // set singer name
        TextView songNameTextView = listItemView.findViewById(R.id.singer_name);
        songNameTextView.setText(currentSinger.name);

        return listItemView;
    }

    public SingerAdaptor(@NonNull Activity context, @NonNull ArrayList<Singer> singers) {
        super(context, 0, singers);
    }
}
