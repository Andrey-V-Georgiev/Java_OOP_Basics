package _02_DefiningClassesEX._08_PokemonTrainer;

class Pokemon {
    private String pokemonName;
    private String element;
    private int health;

    public Pokemon(){
    }

    public Pokemon(String pokemonName, String element, int health){
        this.pokemonName = pokemonName;
        this.element = element;
        this.health = health;
    }

    public String getPokemonName(){
        return this.pokemonName;
    }

    public void setPokemonName(String pokemonName){
        this.pokemonName = pokemonName;
    }

    public String getElement(){
        return this.element;
    }

    public void setElement(String element){
        this.element= element;
    }

    public int getHealth(){
        return this.health;
    }

    public void setHealth(int health){
        this.health = health;
    }
}
