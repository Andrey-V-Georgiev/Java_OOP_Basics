package _03_EncapsulationLab._04_FirstAndReserveTeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(){
    }

    public Team(String name){
        this.name = name;
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }

    public List<Person> getFirstTeam(){
        List<Person> unmodifiableFirstList = Collections.unmodifiableList(this.firstTeam);
        return unmodifiableFirstList;
    }

    public List<Person> getReserveTeam(){
        List<Person> unmodifiableReserveList = Collections.unmodifiableList(this.reserveTeam);
        return unmodifiableReserveList;
    }

    public void addPlayer(Person person){
        if(person.getAge() < 40){
            this.firstTeam.add(person);
        } else {
            this.reserveTeam.add(person);
        }
    }
}
