package _02_DefiningClassesEX._09_Google;

class Car {
    private String carModel;
    private int carSpeed;

    public Car(String carModel, int carSpeed){
        setCarModel(carModel);
        setCarSpeed(carSpeed);
    }

    public String getCarModel(){
        return this.carModel;
    }

    public int getCarSpeed(){
        return this.carSpeed;
    }

    private void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    private void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }
}
