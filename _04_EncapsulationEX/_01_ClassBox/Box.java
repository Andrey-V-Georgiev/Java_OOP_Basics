package _04_EncapsulationEX._01_ClassBox;

class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getSurfaceArea() {
        double surfaceArea = 2 * ((this.length * this.width) + (this.length * this.height) + (this.width * this.height));
        return surfaceArea;
    }

    public double getLateralSurfaceArea() {
        double lateralSurfaceArea = ((2 * this.length) + (2 * this.width)) * this.height;
        return lateralSurfaceArea;
    }

    public double getVolume(){
        double volume = this.length * this.width * this.height;
        return volume;
    }

}
