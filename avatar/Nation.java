package avatar;

import avatar.Bender;
import avatar.Monument;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Nation {
    private List<Bender> benders = new ArrayList<>();
    private List<Monument> monuments = new ArrayList<>();

    public Nation(){
    }

    public void addBender(Bender bender){
        this.benders.add(bender);
    }

    public void addMonument(Monument monument){
        this.monuments.add(monument);
    }

    public List<Bender> getBenders() {
         List<Bender> copyOfBenders = Collections.unmodifiableList(this.benders);
         return copyOfBenders;
    }

    public List<Monument> getMonuments() {
        List<Monument> copyOfMonuments = Collections.unmodifiableList(this.monuments);
        return copyOfMonuments;
    }

    public double getNationTotalPower(){
        double bendersTotalPowerSum = this.benders.stream().mapToDouble(Bender::totalPower).sum();
        Long monumentsAffinitySum = this.monuments.stream().mapToLong(Monument::getAffinity).sum();
        double increaseValue = (bendersTotalPowerSum / 100) * monumentsAffinitySum;
        return bendersTotalPowerSum + increaseValue;
    }

    public void emptyBenders(){
        this.benders.clear();
    }

    public void emptyMonuments(){
        this.monuments.clear();
    }
}
