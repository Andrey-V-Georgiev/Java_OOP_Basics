package _04_EncapsulationEX._03_AnimalFarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name = bf.readLine();
        int age = Integer.parseInt(bf.readLine());
        try{
            Chicken newChicken = new Chicken(name, age);
            System.out.printf("Chicken %s (age %d) can produce %.0f eggs per day.",
                    newChicken.getName(), newChicken.getAge(), newChicken.getProductionPerDay());

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
