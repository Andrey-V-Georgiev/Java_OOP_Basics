package avatar;

public abstract class Bender {
    private String name;
    private int power;

    public Bender(String name, int power) {
        this.setName(name);
        this.setPower(power);
    }

    protected String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (validName(name)) {
            this.name = name;
        } else {
            throw new IllegalArgumentException();
        }
    }

    protected int getPower() {
        return this.power;
    }

    private void setPower(int power) {
        if(power >= 0 && power <= 1000000000){
            this.power = power;
        }else{
            throw new IllegalArgumentException();
        }
    }

    protected boolean validName(String name) {
        char[] nameToCharArr = name.toCharArray();
        for (char c : nameToCharArr) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    protected abstract double totalPower();
}
