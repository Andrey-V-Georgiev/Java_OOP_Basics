package _06_InheritanceEX._05_OnlineRadioDatabase50;

class InvalidSongSecondsException extends InvalidSongLengthException {
    @Override
    public String getMessage(){
        return "Song seconds should be between 0 and 59.";
    }
}
