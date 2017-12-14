package _06_InheritanceEX._05_OnlineRadioDatabase50;

class InvalidArtistNameException extends InvalidSongException {
    @Override
    public String getMessage(){
        return "Artist name should be between 3 and 20 symbols.";
    }
}
