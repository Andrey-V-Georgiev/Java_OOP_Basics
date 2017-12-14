package _04_EncapsulationEX._01_ClassBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double length = Double.parseDouble(bf.readLine());
        double width = Double.parseDouble(bf.readLine());
        double height = Double.parseDouble(bf.readLine());
        Box newBox = new Box(length, width, height);
        System.out.printf("Surface Area - %.2f%n", newBox.getSurfaceArea());
        System.out.printf("Lateral Surface Area - %.2f%n", newBox.getLateralSurfaceArea());
        System.out.printf("Volume - %.2f%n", newBox.getVolume());
    }
}
