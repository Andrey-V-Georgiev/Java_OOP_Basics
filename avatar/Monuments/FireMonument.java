package avatar.Monuments;

import avatar.Monument;

public class FireMonument extends Monument {
    private int fireAffinity;

    public FireMonument(String name, int fireAffinity) {
        super(name);
        this.setFireAffinity(fireAffinity);
    }

    @Override
    public String toString(){
        return String.format("###Fire Monument: %s, Fire Affinity: %d", super.getName(), this.fireAffinity);
    }

    @Override
    protected int getAffinity() {
        return this.fireAffinity;
    }

    public void setFireAffinity(int fireAffinity) {
        if(fireAffinity >= 0 && fireAffinity <= 1000000000){
            this.fireAffinity = fireAffinity;
        }else{
            throw new IllegalArgumentException();
        }
    }
}
