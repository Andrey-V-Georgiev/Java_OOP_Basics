package _06_InheritanceEX._05_OnlineRadioDatabase50;

class InvalidSongLengthException extends InvalidSongException{
    @Override
    public String getMessage(){
        return "Song name should be between 3 and 30 symbols.";
    }
}
