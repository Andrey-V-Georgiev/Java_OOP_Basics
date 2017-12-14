package _06_InheritanceEX._05_OnlineRadioDatabase50;

public class Song {
    private String songName;
    private String artistName;
    private long songMinutes;
    private long songSeconds;
    private long songLengthSeconds;

    public Song(String artistName, String songName, int minutes, int seconds) throws InvalidArtistNameException, InvalidSongLengthException {
        setArtistName(artistName);
        setSongName(songName);
        setSongLength(minutes, seconds);
        setSongMinutes(minutes);
        setSongSeconds(seconds);
    }

    public long getSongLengthSeconds(){
        return this.songLengthSeconds;
    }

    private void setSongLength(long minutes, long seconds) throws InvalidSongLengthException {
        long songLength = (minutes * 60) + seconds;
        if(songLength < 0 || songLength > 899){
            throw new InvalidSongLengthException();
        }
        this.songLengthSeconds = songLength;
    }

    public String getArtistName() {
        return this.artistName;
    }

    private void setArtistName(String artistName) throws InvalidArtistNameException {
        if (artistName.length() < 3 || artistName.length() > 20) {
            throw new InvalidArtistNameException();
        }
        this.artistName = artistName;
    }

    public String getSongName() {
        return this.songName;
    }

    private void setSongName(String songName) throws InvalidSongLengthException {
        if(songName.length() < 3 || songName.length() > 30){
            throw new InvalidSongLengthException();
        }
        this.songName = songName;
    }

    public long getSongMinutes(){
        return this.songMinutes;
    }

    public void setSongMinutes(int songMinutes) throws InvalidSongMinutesException {
        if(songMinutes < 0 || songMinutes > 14){
            throw new InvalidSongMinutesException();
        }
        this.songMinutes = songMinutes;
    }

    public long getSongSeconds() {
        return this.songSeconds;
    }

    private void setSongSeconds(int songSeconds) throws InvalidSongSecondsException {
        if(songSeconds < 0 || songSeconds > 59){
            throw new InvalidSongSecondsException();
        }
        this.songSeconds = songSeconds;
    }
}
