package _05_InheritanceLab._05_RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<Object> extends ArrayList {
    Random rnd = new Random();

    public Object getRandomElement(){
        int index = rnd.nextInt(super.size() -1);
        return (Object) super.remove(index);
    }
}
