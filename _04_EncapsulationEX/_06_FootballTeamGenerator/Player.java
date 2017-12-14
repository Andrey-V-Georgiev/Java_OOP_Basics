package _04_EncapsulationEX._06_FootballTeamGenerator;

class Player {
    static final int MIN = 1;
    static final int MAX = 100;
    private String name;
    private double endurance;
    private double sprint;
    private double dribble;
    private double passing;
    private double shooting;
    private double stats;

    public Player(String name, double endurance, double sprint, double dribble, double passing, double shooting) {
        setDetails(name, endurance, sprint, dribble, passing, shooting);
    }

    private void setDetails(String name, double endurance, double sprint, double dribble, double passing, double shooting) {
        this.name = name;

        if (endurance > MIN && endurance > MAX) {
            throw new IllegalArgumentException("Endurance should be between 0 and 100.");

        } else {
            this.endurance = endurance;
        }

        if (sprint < MIN || sprint > MAX) {
            throw new IllegalArgumentException("Sprint should be between 0 and 100.");
        } else {
            this.sprint = sprint;
        }

        if (dribble < MIN || dribble > MAX) {
            throw new IllegalArgumentException("Dribble should be between 0 and 100.");
        } else {
            this.dribble = dribble;
        }

        if (dribble < MIN || dribble > MAX) {
            throw new IllegalArgumentException("Passing should be between 0 and 100.");
        } else {
            this.passing = passing;
        }

        if (dribble < MIN || dribble > MAX) {
            throw new IllegalArgumentException("Shooting should be between 0 and 100.");
        } else {
            this.shooting = shooting;
        }
        setStats();
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public double getStats() {
        return this.stats;
    }

    private void setStats() {
        double average = (this.endurance + this.sprint + this.dribble + this.passing + this.shooting) / 5;
        this.stats = average;
    }
}
