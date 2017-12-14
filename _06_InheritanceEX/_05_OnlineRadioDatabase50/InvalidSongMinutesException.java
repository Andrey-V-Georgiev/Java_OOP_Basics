package _06_InheritanceEX._05_OnlineRadioDatabase50;

class InvalidSongMinutesException extends InvalidSongLengthException {
    @Override
    public String getMessage(){
        return "Song minutes should be between 0 and 14.";
    }
}
