package avatar;

import avatar.Benders.AirBender;
import avatar.Benders.EarthBender;
import avatar.Benders.FireBender;
import avatar.Benders.WaterBender;
import avatar.Monuments.AirMonument;
import avatar.Monuments.EarthMonument;
import avatar.Monuments.FireMonument;
import avatar.Monuments.WaterMonument;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.*;

public class Main {
    static Nation airNation = new Nation();
    static Nation fireNation = new Nation();
    static Nation waterNation = new Nation();
    static Nation earthNation = new Nation();
    static int warNum = 1;
    static Deque<String> warData = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                String[] tokens = bf.readLine().split("\\s+");
                String command = tokens[0];
                switch (command) {
                    case "Bender":
                        createBender(tokens);
                        break;
                    case "Monument":
                        createMonument(tokens);
                        break;
                    case "Status":
                        String typeForStatus = tokens[1];
                        printStatusOf(typeForStatus);
                        break;
                    case "War":
                        String typeOfWarStarter = tokens[1];
                        doTheWarChanges(typeOfWarStarter);
                        break;
                    case "Quit":
                        printAndQuit();
                        return;
                    default:
                        throw new IllegalArgumentException();
                }
            }
        } catch (Exception ex) {

        }
    }

    private static void createMonument(String[] tokens) {
        String monumentType = tokens[1];
        String monumentName = tokens[2];
        int affinity = Integer.parseInt(tokens[3]);
        Monument newMonument = null;

        switch (monumentType) {
            case "Air":
                newMonument = new AirMonument(monumentName, affinity);
                airNation.addMonument(newMonument);
                break;
            case "Fire":
                newMonument = new FireMonument(monumentName, affinity);
                fireNation.addMonument(newMonument);
                break;
            case "Water":
                newMonument = new WaterMonument(monumentName, affinity);
                waterNation.addMonument(newMonument);
                break;
            case "Earth":
                newMonument = new EarthMonument(monumentName, affinity);
                earthNation.addMonument(newMonument);
                break;
            default:
                throw new IllegalArgumentException();
        }

    }

    private static void createBender(String[] tokens) {
        String benderType = tokens[1];
        String benderName = tokens[2];
        int power = Integer.parseInt(tokens[3]);
        double secondArgument = Double.parseDouble(tokens[4]);
        Bender newBender = null;

        switch (benderType) {
            case "Air":
                newBender = new AirBender(benderName, power, secondArgument);
                airNation.addBender(newBender);
                break;
            case "Fire":
                newBender = new FireBender(benderName, power, secondArgument);
                fireNation.addBender(newBender);
                break;
            case "Water":
                newBender = new WaterBender(benderName, power, secondArgument);
                waterNation.addBender(newBender);
                break;
            case "Earth":
                newBender = new EarthBender(benderName, power, secondArgument);
                earthNation.addBender(newBender);
                break;
            default:
                throw new IllegalArgumentException();
        }

    }

    private static void doTheWarChanges(String typeOfWarStarter) {
        List<Nation> listNations = new ArrayList<>(Arrays.asList(airNation, fireNation, waterNation, earthNation));
        double maxTotalPower = Double.MIN_VALUE;
        for (Nation nation : listNations) {
            if (nation.getNationTotalPower() > maxTotalPower) {
                maxTotalPower = nation.getNationTotalPower();
            }
        }
        for (Nation nation : listNations) {
            if (nation.getNationTotalPower() < maxTotalPower) {
                nation.emptyBenders();
                nation.emptyMonuments();
            }
        }
        String currentWarData = String.format("War %d issued by %s", warNum, typeOfWarStarter);
        warData.add(currentWarData);
        warNum++;
    }

    private static void printAndQuit() {
        while (!warData.isEmpty()) {
            System.out.println(warData.poll());
        }
    }

    private static void printStatusOf(String typeForStatus) {
        switch (typeForStatus) {
            case "Air":
                System.out.println(typeForStatus + " Nation");
                if (airNation.getBenders().size() > 0) {
                    System.out.println("Benders:");
                    for (Bender bender : airNation.getBenders()) {
                        System.out.println(bender.toString());
                    }
                } else {
                    System.out.println("Benders: None");
                }
                if (airNation.getMonuments().size() > 0) {
                    System.out.println("Monuments:");
                    for (Monument monument : airNation.getMonuments()) {
                        System.out.println(monument.toString());
                    }
                } else {
                    System.out.println("Monuments: None");
                }
                break;

            case "Fire":
                System.out.println(typeForStatus + " Nation");
                if (fireNation.getBenders().size() > 0) {
                    System.out.println("Benders:");
                    for (Bender bender : fireNation.getBenders()) {
                        System.out.println(bender.toString());
                    }
                } else {
                    System.out.println("Benders: None");
                }
                if (fireNation.getMonuments().size() > 0) {
                    System.out.println("Monuments:");
                    for (Monument monument : fireNation.getMonuments()) {
                        System.out.println(monument.toString());
                    }
                } else {
                    System.out.println("Monuments: None");
                }
                break;

            case "Water":
                System.out.println(typeForStatus + " Nation");
                if (waterNation.getBenders().size() > 0) {
                    System.out.println("Benders:");
                    for (Bender bender : waterNation.getBenders()) {
                        System.out.println(bender.toString());
                    }
                } else {
                    System.out.println("Benders: None");
                }
                if (waterNation.getMonuments().size() > 0) {
                    System.out.println("Monuments:");
                    for (Monument monument : waterNation.getMonuments()) {
                        System.out.println(monument.toString());
                    }
                } else {
                    System.out.println("Monuments: None");
                }
                break;

            case "Earth":
                System.out.println(typeForStatus + " Nation");
                if (earthNation.getBenders().size() > 0) {
                    System.out.println("Benders:");
                    for (Bender bender : earthNation.getBenders()) {
                        System.out.println(bender.toString());
                    }
                } else {
                    System.out.println("Benders: None");
                }
                if (earthNation.getMonuments().size() > 0) {
                    System.out.println("Monuments:");
                    for (Monument monument : earthNation.getMonuments()) {
                        System.out.println(monument.toString());
                    }
                } else {
                    System.out.println("Monuments: None");
                }
                break;
            default:
                throw new IllegalArgumentException();
        }

    }
}
