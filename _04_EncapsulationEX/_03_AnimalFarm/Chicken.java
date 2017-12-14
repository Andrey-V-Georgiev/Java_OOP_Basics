package _04_EncapsulationEX._03_AnimalFarm;

class Chicken {
    private String name;
    private int age;
    private double productionPerDay;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
        calculateProductPerDay();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.trim().length() < 1 || name.equalsIgnoreCase(" ") || name == null) {
            throw new IllegalArgumentException("Name cannot be empty.");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 15) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
    }

    public double getProductionPerDay() {
        return this.productionPerDay;
    }

    private void calculateProductPerDay() {
        if (this.age < 6) {
            this.productionPerDay = 2;
        } else if (this.age > 5 && this.age < 12) {
            this.productionPerDay = 1;
        } else {
            this.productionPerDay = 0.75;
        }
    }
}
