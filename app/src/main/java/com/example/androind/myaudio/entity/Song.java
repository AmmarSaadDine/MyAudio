package com.example.androind.myaudio.entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ammar_saaddine on 28.02.18.
 */

public class Song implements Parcelable {

    // Public properties
    public String name;
    public Singer singer;

    // Constructors
    public Song(String name, Singer singer) {
        this.name = name;
        this.singer = singer;
    }

    // Generated code by parcelable

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeParcelable(this.singer, flags);
    }

    protected Song(Parcel in) {
        this.name = in.readString();
        this.singer = in.readParcelable(Singer.class.getClassLoader());
    }

    public static final Parcelable.Creator<Song> CREATOR = new Parcelable.Creator<Song>() {
        @Override
        public Song createFromParcel(Parcel source) {
            return new Song(source);
        }

        @Override
        public Song[] newArray(int size) {
            return new Song[size];
        }
    };
}
