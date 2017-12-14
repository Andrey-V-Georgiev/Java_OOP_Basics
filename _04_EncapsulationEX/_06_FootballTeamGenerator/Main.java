package _04_EncapsulationEX._06_FootballTeamGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static HashMap<String, FootballTeam> teams = new HashMap<>();

    public static void main(String[] args) throws IOException {
        String[] tokens = bf.readLine().split(";");
        while (!"END".equalsIgnoreCase(tokens[0].trim())) {
            switch (tokens[0].trim()) {
                case "Team":
                    String newTeamName = tokens[1].trim();
                    if (newTeamName.isEmpty() || newTeamName.equals(null) || newTeamName.equals("\\s+")) {
                        System.out.println("A name should not be empty.");
                        break;
                    }
                    FootballTeam newTeam = new FootballTeam(newTeamName);
                    teams.put(newTeamName, new FootballTeam(newTeamName));

                    break;
                case "Add":
                    String teamName = tokens[1].trim();
                    if (!teams.containsKey(teamName)) {
                        System.out.printf("Team %s does not exist.", teamName);
                        break;
                    }
                    String newPlayerName = tokens[2].trim();
                    if (newPlayerName.isEmpty() || newPlayerName.equals(null) || newPlayerName.equals("\\s+")) {
                        System.out.println("A name should not be empty.");
                        break;
                    }
                    try {
                        double endurance = Integer.parseInt(tokens[3].trim());
                        double sprint = Integer.parseInt(tokens[4].trim());
                        double dribble = Integer.parseInt(tokens[5].trim());
                        double passing = Integer.parseInt(tokens[6].trim());
                        double shooting = Integer.parseInt(tokens[7].trim());
                        Player newPlayer = new Player(newPlayerName, endurance, sprint, dribble, passing, shooting);
                        teams.get(teamName).addPlayer(newPlayerName, newPlayer);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Remove":
                    String teamOfPlayer = tokens[1].trim();
                    String playerForRemove = tokens[2].trim();
                    try {
                        teams.get(teamOfPlayer).removePlayer(playerForRemove);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Rating":
                    String teamForRating = tokens[1].trim();
                    if (!teams.containsKey(teamForRating)) {
                        System.out.printf("Team %s does not exist.%n", teamForRating);
                        break;
                    }
                    try {
                        System.out.printf("%s - %.0f%n", teamForRating, teams.get(teamForRating).getRating());
                    }catch (Exception e){
                        System.out.printf("%s - 0%n", teamForRating);
                    }
                    break;
            }

            tokens = bf.readLine().split(";");
        }

    }
}
