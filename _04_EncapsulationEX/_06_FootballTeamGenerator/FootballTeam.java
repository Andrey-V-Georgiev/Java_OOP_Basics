package _04_EncapsulationEX._06_FootballTeamGenerator;

import java.util.HashMap;

class FootballTeam {
    private String name;
    private double rating;
    private HashMap<String, Player> players = new HashMap<>();

    public FootballTeam(String name) {
        this.name = name;
        this.players = new HashMap<>();
    }

    public double getRating(){
       double rating = this.players.entrySet().stream().mapToDouble(x->x.getValue().getStats()).average().getAsDouble();
       this.rating = rating;
       return this.rating;
    }

    public void addPlayer(String playerName, Player player){
        this.players.put(playerName, player);
    }

    public void removePlayer(String name){
       if(this.players.containsKey(name)){
           this.players.remove(name);
       } else {
            throw new IllegalArgumentException(String.format("Player %s is not in %s team.", name, this.name));
       }
    }
}
