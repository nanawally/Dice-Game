package se.anna.dicegame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Player 1, choose your name");
            Player player1 = new Player(scanner.nextLine());
            System.out.println("Player 2, choose your name");
            Player player2 = new Player(scanner.nextLine());

            System.out.println("Welcome, " + player1.getName() + " and " + player2.getName() + "!\n" +
                    player1.getName() + ", roll your first dice by pressing Enter.");
            try {
                System.in.read();
            } catch (Exception e) {
            }
            DiceRoll diceRoll1 = new DiceRoll();
            int roll1 = diceRoll1.roll();
            System.out.println(player1.getName() + ", you rolled " + roll1 + "!\n" + player2.getName() +
                    ", roll your first dice by pressing Enter.");
            try {
                System.in.read();
            } catch (Exception e) {
            }
            DiceRoll diceRoll2 = new DiceRoll();
            int roll2 = diceRoll2.roll();
            System.out.println(player2.getName() + ", you rolled " + roll2 + "!\n" + player1.getName() +
                    ", roll your second dice by pressing Enter.");
            try {
                System.in.read();
            } catch (Exception e) {
            }
            DiceRoll diceRoll3 = new DiceRoll();
            int roll3 = diceRoll3.roll();
            System.out.println(player1.getName() + ", you rolled " + roll3 + "!\n" + player2.getName() +
                    ", roll your second dice by pressing Enter.");
            try {
                System.in.read();
            } catch (Exception e) {
            }
            DiceRoll diceRoll4 = new DiceRoll();
            int roll4 = diceRoll4.roll();
            System.out.println(player2.getName() + ", you rolled " + roll4 + "!");
            if (roll1 + roll3 > roll2 + roll4) {
                System.out.println(roll1 + " plus " + roll3 + " equals " + (roll1 + roll3) + " which is higher than " +
                        (roll2 + roll4) + ". " + player1.getName() + " wins!");
            } else {
                System.out.println(roll2 + " plus " + roll4 + " equals " + (roll2 + roll4) + " which is higher than " +
                        (roll1 + roll3) + ". " + player2.getName() + " wins!");
            }

            while (true) {
                System.out.println("Play again? Input 1 for yes or 2 for no.");
                int yesOrNo = scanner.nextInt();
                scanner.nextLine();
                if (yesOrNo == 1) {
                    break;
                } else if (yesOrNo == 2) {
                    System.out.println("Thank you for playing!");
                    scanner.close();
                    return;
                } else {
                    System.out.println("That is not a 1 (play another game) or 2 (exit the program).");
                }
            }
        }
    }
}
