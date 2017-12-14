package _06_InheritanceEX._04_MordorsCrueltyPlan;

import java.util.List;

class Mood {
    private String mood;
    private int points;

    public Mood(List<String> foods) {
        setMood(foods);
    }

    public String getMood() {
        return mood;
    }

    public int getPoints() {
        return points;
    }

    private void setMood(List<String> foods) {
        int points = 0;
        for (String food : foods) {
            switch (food){
                case "cram":
                    points += 2;
                    break;
                case "lembas":
                    points += 3;
                    break;
                case "apple":
                    points += 1;
                    break;
                case "melon":
                    points += 1;
                    break;
                case "honeycake":
                    points += 5;
                    break;
                case "mushrooms":
                    points -= 10;
                    break;
                default:
                    points -= 1;
                    break;
            }
        }
        this.points = points;

        if(points < -5){
            this.mood = "Angry";
        } else if(points >= -5 && points <= 0){
            this.mood = "Sad";
        } else if(points >= 0 && points <= 15){
            this.mood = "Happy";
        } else if(points > 15){
            this.mood = "JavaScript";
        }
    }
}
