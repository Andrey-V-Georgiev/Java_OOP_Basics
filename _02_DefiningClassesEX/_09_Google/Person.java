package _02_DefiningClassesEX._09_Google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private Company company;
    private Car car ;
    private ArrayList<Pokemon> pokemons = new ArrayList<>();
    private ArrayList<Parent> parents = new ArrayList<>();
    private ArrayList<Child> children = new ArrayList<>();

    public Person() {
    }

    public void setPerson(String[] tokens){
        setProperties(tokens);
    }

    private void setProperties(String[] tokens) {
        switch (tokens[1]) {
            case "company":
                setCompany(tokens);
                break;
            case "car":
                setCar(tokens);
                break;
            case "pokemon":
                setPokemons(tokens);
                break;
            case "parents":
                setParents(tokens);
                break;
            case "children":
                setChildren(tokens);
                break;
        }
    }

    public Company getCompany() {
        return this.company;
    }

    public Car getCar() {
        return this.car;
    }

    public List<Pokemon> getPokemons() {
        return Collections.unmodifiableList(this.pokemons);
    }

    public List<Parent> getParents() {
        return Collections.unmodifiableList(this.parents);
    }

    public List<Child> getChildren() {
        return Collections.unmodifiableList(this.children);
    }

    private void setCompany(String[] tokens) {
        Company newCompany = new Company(tokens[2], tokens[3], Double.parseDouble(tokens[4]));
        this.company = newCompany;
    }

    private void setCar(String[] tokens) {
        Car newCar = new Car(tokens[2], Integer.parseInt(tokens[3]));
        this.car = newCar;
    }

    private void setPokemons(String[] tokens) {
        Pokemon newPokemon = new Pokemon(tokens[2], tokens[3]);
        this.pokemons.add(newPokemon);
    }

    private void setParents(String[] tokens) {
        Parent newParent = new Parent(tokens[2], tokens[3]);
        this.parents.add(newParent);
    }

    private void setChildren(String[] tokens) {
        Child newChild = new Child(tokens[2], tokens[3]);
        this.children.add(newChild);
    }
}
