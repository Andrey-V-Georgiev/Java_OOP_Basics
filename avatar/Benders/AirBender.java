package avatar.Benders;

import avatar.Bender;

public class AirBender extends Bender {
        private double aerialIntegrity;

    public AirBender(String name, int power, double aerialIntegrity) {
        super(name, power);
        this.setAerialIntegrity(aerialIntegrity);
    }


    @Override
    protected double totalPower() {
        return super.getPower() * this.aerialIntegrity;
    }

    @Override
    public String toString(){
        return String.format("###Air Bender: %s, Power: %d, Aerial Integrity: %.2f",
                super.getName(), super.getPower(), this.aerialIntegrity);
    }

    public void setAerialIntegrity(double aerialIntegrity) {
        if(aerialIntegrity >= 0 && aerialIntegrity <= 1000000){
            this.aerialIntegrity = aerialIntegrity;
        }else{
            throw new IllegalArgumentException();
        }
    }
}
