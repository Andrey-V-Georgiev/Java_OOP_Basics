package _02_DefiningClassesEX._06_RawData;

class Tyres {
    private double pressureT1;
    private int ageT1;
    private double pressureT2;
    private int ageT2;
    private double pressureT3;
    private int ageT3;
    private double pressureT4;
    private int ageT4;

    public Tyres(double pressureT1, int ageT1, double pressureT2, int ageT2, double pressureT3, int ageT3, double pressureT4, int ageT4) {
        this.pressureT1 = pressureT1;
        this.ageT1 = ageT1;
        this.pressureT2 = pressureT2;
        this.ageT2 = ageT2;
        this.pressureT3 = pressureT3;
        this.ageT3 = ageT3;
        this.pressureT4 = pressureT4;
        this.ageT4 = ageT4;
    }

    public double getPressureT1() {
        return this.pressureT1;
    }

    public void setPressureT1(double pressureT1) {
        this.pressureT1 = pressureT1;
    }

    public int getAgeT1() {
        return this.ageT1;
    }

    public void setAgeT1(int ageT1) {
        this.ageT1 = ageT1;
    }

    public double getPressureT2() {
        return this.pressureT2;
    }

    public void setPressureT2(double pressureT2) {
        this.pressureT2 = pressureT2;
    }

    public int getAgeT2() {
        return this.ageT2;
    }

    public void setAgeT2(int ageT2) {
        this.ageT2 = ageT2;
    }

    public double getPressureT3() {
        return this.pressureT3;
    }

    public void setPressureT3(double pressureT3) {
        this.pressureT3 = pressureT3;
    }

    public int getAgeT3() {
        return this.ageT3;
    }

    public void setAgeT3(int ageT3) {
        this.ageT3 = ageT3;
    }

    public double getPressureT4() {
        return this.pressureT4;
    }

    public void setPressureT4(double pressureT4) {
        this.pressureT4 = pressureT4;
    }

    public int getAgeT4() {
        return this.ageT4;
    }

    public void setAgeT4(int ageT4) {
        this.ageT4 = ageT4;
    }

    public double getAveragePressure() {
        return (pressureT1 + pressureT2 + pressureT3 + pressureT4) / 4;
    }
}
