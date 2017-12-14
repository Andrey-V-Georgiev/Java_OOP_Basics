package avatar.Monuments;

import avatar.Monument;

public class AirMonument extends Monument{
    private int airAffinity;

    public AirMonument(String name, int airAffinity) {
        super(name);
        this.setAirAffinity(airAffinity);
    }

    @Override
    public String toString(){
        return String.format("###Air Monument: %s, Air Affinity: %d", super.getName(), this.airAffinity);
    }

    @Override
    protected int getAffinity() {
        return this.airAffinity;
    }

    public void setAirAffinity(int airAffinity) {
        if(airAffinity >= 0 && airAffinity <= 1000000000){
            this.airAffinity = airAffinity;
        }else{
            throw new IllegalArgumentException();
        }
    }
}
