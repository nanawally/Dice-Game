package se.anna.dicegame;

import java.util.Random;

public class DiceRoll {
    public int roll() {
        Random random = new Random();
        int roll = random.nextInt(6) + 1;
        return roll;
    }
}
