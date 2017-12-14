package _06_InheritanceEX._04_MordorsCrueltyPlan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<String> foods = Stream.of(bf.readLine().split("\\s+"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        Mood mood = new Mood(foods);
        System.out.println(mood.getPoints());
        System.out.println(mood.getMood());
    }
}
