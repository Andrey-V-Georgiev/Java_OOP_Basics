package _06_InheritanceEX._05_OnlineRadioDatabase87;

public class Song {

    public Song(String artistName, String songName, long minutes, long seconds) {
        setArtistName(artistName);
        setSongName(songName);
        setSongMinutes(minutes);
        setSongSeconds(seconds);
    }

    private void setArtistName(String artistName) {
        if (artistName.length() < 3 || artistName.length() > 20) {
            throw new IllegalArgumentException("Artist name should be between 3 and 20 symbols.");
        }
    }

    private void setSongName(String songName) {
        if (songName.length() < 3 || songName.length() > 30) {
            throw new IllegalArgumentException("Song name should be between 3 and 30 symbols.");
        }
    }


    private void setSongMinutes(long songMinutes) {
        if (songMinutes < 0 || songMinutes > 14) {
            throw new IllegalArgumentException("Song minutes should be between 0 and 14.");
        }
    }


    private void setSongSeconds(long songSeconds) {
        if (songSeconds < 0 || songSeconds > 59) {
            throw new IllegalArgumentException("Song seconds should be between 0 and 59.");
        }
    }
}
