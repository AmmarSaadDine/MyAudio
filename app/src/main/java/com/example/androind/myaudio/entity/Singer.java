package com.example.androind.myaudio.entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ammar_saaddine on 28.02.18.
 */

public class Singer implements Parcelable {

    // Public properties
    public String name;
    public Integer imageID;

    // Constructors
    public Singer(String name, Integer imageID) {
        this.name = name;
        this.imageID = imageID;
    }

    // Public methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Singer singer = (Singer) o;

        return name.equals(singer.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    // Generated code by parcelable

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeValue(this.imageID);
    }

    protected Singer(Parcel in) {
        this.name = in.readString();
        this.imageID = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Parcelable.Creator<Singer> CREATOR = new Parcelable.Creator<Singer>() {
        @Override
        public Singer createFromParcel(Parcel source) {
            return new Singer(source);
        }

        @Override
        public Singer[] newArray(int size) {
            return new Singer[size];
        }
    };
}
