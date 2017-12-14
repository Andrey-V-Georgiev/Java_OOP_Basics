package _06_InheritanceEX._05_OnlineRadioDatabase50;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private List<Song> songs = new ArrayList<>();
    private long addedSongs;

    public PlayList() {
    }

    public void addSong(Song song) {
        this.songs.add(song);
        this.addedSongs++;
    }

    public String getNumAddedSongs(){
        return String.format("Songs added: %d",this.addedSongs);
    }

    public String getPlaylistLength() {
        long hours = 0;
        long minutes = 0;
        long seconds = 0;
        long sumSeconds = this.songs.stream().mapToLong(Song::getSongLengthSeconds).sum();
        hours = sumSeconds / 3600;
        minutes = (sumSeconds % 3600) / 60;
        seconds = sumSeconds % 60;
        return String.format("Playlist length: %dh %dm %ds", hours, minutes, seconds);
    }
}
