package avatar.Benders;

import avatar.Bender;

public class EarthBender extends Bender {
        private double groundSaturation;

    public EarthBender(String name, int power, double groundSaturation) {
        super(name, power);
        this.setGroundSaturation(groundSaturation);
    }

    @Override
    protected double totalPower() {
        return super.getPower() * this.groundSaturation;
    }

    @Override
    public String toString(){
        return String.format("###Earth Bender: %s, Power: %d, Ground Saturation: %.2f",
                super.getName(), super.getPower(), this.groundSaturation);
    }

    public void setGroundSaturation(double groundSaturation) {
        if(groundSaturation >= 0 && groundSaturation <= 1000000){
            this.groundSaturation = groundSaturation;
        }else{
            throw new IllegalArgumentException();
        }
    }
}
