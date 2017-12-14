package avatar.Benders;

import avatar.Bender;

public class WaterBender extends Bender {
    private double waterClarity;

    public WaterBender(String name, int power, double waterClarity) {
        super(name, power);
        this.setWaterClarity(waterClarity);
    }


    @Override
    protected double totalPower() {
        return super.getPower() * this.waterClarity;
    }

    @Override
    public String toString(){
        return String.format("###Water Bender: %s, Power: %d, Water Clarity: %.2f",
                super.getName(), super.getPower(), this.waterClarity);
    }

    public void setWaterClarity(double waterClarity) {
        if(waterClarity >= 0 && waterClarity <= 1000000){
            this.waterClarity = waterClarity;
        }else{
            throw new IllegalArgumentException();
        }
    }
}
