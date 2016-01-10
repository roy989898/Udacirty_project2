package pom2.poly.com.trythemoviedbapi;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by User on 10/1/2016.
 */
public class Movi_e implements Parcelable {
    public static final Creator<Movi_e> CREATOR = new Creator<Movi_e>() {
        @Override
        public Movi_e createFromParcel(Parcel in) {
            return new Movi_e(in);
        }

        @Override
        public Movi_e[] newArray(int size) {
            return new Movi_e[size];
        }
    };
    String poster_path;
    String overview;
    String release_date;
    String id;
    String original_title;
    String title;
    String backdrop_path;
    String popularity;
    String vote_count;
    String video;
    String vote_average;

    protected Movi_e(Parcel in) {
        poster_path = in.readString();
        overview = in.readString();
        release_date = in.readString();
        id = in.readString();
        original_title = in.readString();
        title = in.readString();
        backdrop_path = in.readString();
        popularity = in.readString();
        vote_count = in.readString();
        video = in.readString();
        vote_average = in.readString();
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getVote_average() {
        return vote_average;
    }

    public void setVote_average(String vote_average) {
        this.vote_average = vote_average;
    }

    public String getVote_count() {
        return vote_count;
    }

    public Movi_e setVote_count(String vote_count) {
        this.vote_count = vote_count;
        return this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(poster_path);
        dest.writeString(overview);
        dest.writeString(release_date);
        dest.writeString(id);
        dest.writeString(original_title);
        dest.writeString(title);
        dest.writeString(backdrop_path);
        dest.writeString(popularity);
        dest.writeString(vote_count);
        dest.writeString(video);
        dest.writeString(vote_average);
    }
}