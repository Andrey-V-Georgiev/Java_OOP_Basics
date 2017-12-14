package _02_DefiningClassesEX._08_PokemonTrainer;

import java.util.List;

class Trainer {
    private int badges = 0;
    private List<Pokemon> pokemons;

    public Trainer(){
    }

    public Trainer(List<Pokemon> pokemons){
        this.pokemons = pokemons;
    }

    public int getBadges() {
        return this.badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
