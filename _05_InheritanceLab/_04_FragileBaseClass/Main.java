package _05_InheritanceLab._04_FragileBaseClass;

public class Main {
    public static void main(String[] args) {
        Predator predator = new Predator();
        predator.feed(new Food());
        predator.feed(new Food());
        predator.feed(new Food());
        System.out.println(predator.getHealth());

    }
}
