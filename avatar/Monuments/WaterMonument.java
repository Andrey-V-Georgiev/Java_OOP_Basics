package avatar.Monuments;

import avatar.Monument;

public class WaterMonument extends Monument {
    private int waterAffinity;

    public WaterMonument(String name, int waterAffinity) {
        super(name);
        this.setWaterAffinity(waterAffinity);
    }

    @Override
    public String toString(){
        return String.format("###Water Monument: %s, Water Affinity: %d", super.getName(), this.waterAffinity);
    }

    @Override
    protected int getAffinity() {
        return this.waterAffinity;
    }

    public void setWaterAffinity(int waterAffinity) {
        if(waterAffinity >= 0 && waterAffinity <= 1000000000){
            this.waterAffinity = waterAffinity;
        }else{
            throw new IllegalArgumentException();
        }
    }
}
