package _05_InheritanceLab._05_RandomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList ral = new RandomArrayList<>();
        ral.add("a");
        ral.add("b");
        ral.add("c");
        ral.add(1);
        ral.add(2);
        ral.add(3);

        System.out.println(ral.getRandomElement());
        System.out.println(ral);
    }
}
