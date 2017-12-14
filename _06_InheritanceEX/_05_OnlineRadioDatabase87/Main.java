package _06_InheritanceEX._05_OnlineRadioDatabase87;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long totalSeconds;
    static long songsCount;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = bf.readLine().split(";");
            String artistName = tokens[0].trim();
            String songName = tokens[1].trim();
            String[] time = tokens[2].split(":");
            long minutes = Long.parseLong(time[0]);
            long seconds = Long.parseLong(time[1]);
            try {
                Song newSong = new Song(artistName, songName, minutes, seconds);
                System.out.println("Song added.");
                songsCount++;
                totalSeconds += seconds + (minutes * 60);
            }catch (NumberFormatException e) {
                System.out.println("Invalid song length.");
            }catch(IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("Songs added: " + songsCount);
        System.out.printf("Playlist length: " + calculateSongsLenght(totalSeconds));

    }

    private static String calculateSongsLenght(long totalSeconds) {
        long hours = totalSeconds / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;
        return hours + "h " + minutes + "m " + seconds + "s";
    }
}
