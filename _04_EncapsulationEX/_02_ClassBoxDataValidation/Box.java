package _04_EncapsulationEX._02_ClassBoxDataValidation;

class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
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

    private void setLength(double length) {
       if(length <= 0){
           throw new IllegalArgumentException("Length cannot be zero or negative.");
       }
        this.length = length;
    }

    private void setWidth(double width) {
        if(width <= 0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if(height <= 0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
       }
       this.height = height;
    }
}
