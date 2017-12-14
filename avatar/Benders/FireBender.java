package avatar.Benders;

import avatar.Bender;

public class FireBender extends Bender {
    private double heatAggression;

    public FireBender(String name, int power, double heatAggression) {
        super(name, power);
        this.setHeatAggression(heatAggression);
    }


    @Override
    protected double totalPower() {
        return super.getPower() * this.heatAggression;
    }

    @Override
    public String toString(){
        return String.format("###Fire Bender: %s, Power: %d, Heat Aggression: %.2f",
                super.getName(), super.getPower(), this.heatAggression);
    }

    public void setHeatAggression(double heatAggression) {
        if(heatAggression >= 0 && heatAggression <= 1000000){
            this.heatAggression = heatAggression;
        }else{
            throw new IllegalArgumentException();
        }
    }
}
