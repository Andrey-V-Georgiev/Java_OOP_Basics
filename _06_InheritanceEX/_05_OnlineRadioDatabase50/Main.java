package _06_InheritanceEX._05_OnlineRadioDatabase50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException, InvalidArtistNameException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PlayList playlist = new PlayList();
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = bf.readLine().split(";");
            String artistName = tokens[0].trim();
            String songName = tokens[1].trim();
            String[] songLength = tokens[2].split(":");
            int minutes = Integer.parseInt(songLength[0]);
            int seconds = Integer.parseInt(songLength[1]);
            try {
                Song newSong = new Song(artistName, songName, minutes, seconds);
                playlist.addSong(newSong);
                System.out.println("Song added.");
            }catch (InvalidSongLengthException ex){
                System.out.println(ex.getMessage());
            }catch(InvalidSongException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println(playlist.getNumAddedSongs());
        System.out.println(playlist.getPlaylistLength());
    }
}
