package avatar.Monuments;

import avatar.Monument;

public class EarthMonument extends Monument {
    private int earthAffinity;

    public EarthMonument(String name, int earthAffinity) {
        super(name);
        this.setEarthAffinity(earthAffinity);
    }

    @Override
    public String toString(){
        return String.format("###Earth Monument: %s, Earth Affinity: %d", super.getName(), this.earthAffinity);
    }

    @Override
    protected int getAffinity() {
        return this.earthAffinity;
    }

    public void setEarthAffinity(int earthAffinity) {
        if(earthAffinity >= 0 && earthAffinity <= 1000000000){
            this.earthAffinity = earthAffinity;
        }else{
            throw new IllegalArgumentException();
        }
    }
}
