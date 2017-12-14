package _02_DefiningClassesEX._09_Google;

class Pokemon {
    private String pokemonName;
    private String pokemonType;

    public Pokemon(String pokemonName, String pokemonType) {
        setPokemonName(pokemonName);
        setPokemonType(pokemonType);
    }

    public String getPokemonName() {
        return this.pokemonName;
    }

    private void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public String getPokemonType() {
        return this.pokemonType;
    }

    private void setPokemonType(String pokemonType) {
        this.pokemonType = pokemonType;
    }

}

