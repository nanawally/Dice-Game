package se.anna.dicegame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Player player1;
    static Player player2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            playerNames();
            playGame(player1, player2);

            while (true) {
                try {
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
                } catch (InputMismatchException e) {
                    System.out.println("That is not a 1 (play another game) or 2 (exit the program).");
                    scanner.nextLine();
                }
            }
        }
    }

    static void playerNames() {
        Scanner scanner = new Scanner(System.in);
        //NAMN PÅ SPELARE
        System.out.println("Player 1, choose your name");
        player1 = new Player(scanner.nextLine());
        System.out.println("Player 2, choose your name");
        player2 = new Player(scanner.nextLine());
        System.out.println("Welcome, " + player1.getName() + " and " + player2.getName() + "!");
    }

    static void playGame(Player player1, Player player2) {
        Scanner scanner = new Scanner(System.in);
        //TÄRNINGSRULLNINGAR
        System.out.println(player1.getName() + ", roll your first dice by pressing Enter.");
        scanner.nextLine();
        DiceRoll diceRoll1 = new DiceRoll();
        int roll1 = diceRoll1.roll();
        System.out.println(player1.getName() + ", you rolled " + roll1 + "!\n" + player2.getName() +
                ", roll your first dice by pressing Enter.");
        scanner.nextLine();
        DiceRoll diceRoll2 = new DiceRoll();
        int roll2 = diceRoll2.roll();
        System.out.println(player2.getName() + ", you rolled " + roll2 + "!\n" + player1.getName() +
                ", roll your second dice by pressing Enter.");
        scanner.nextLine();
        DiceRoll diceRoll3 = new DiceRoll();
        int roll3 = diceRoll3.roll();
        System.out.println(player1.getName() + ", you rolled " + roll3 + "!\n" + player2.getName() +
                ", roll your second dice by pressing Enter.");
        scanner.nextLine();
        DiceRoll diceRoll4 = new DiceRoll();
        int roll4 = diceRoll4.roll();
        System.out.println(player2.getName() + ", you rolled " + roll4 + "!");

        //RESULTAT
        System.out.println("\n" + player1.getName() + " rolled " + roll1 + " and " + roll3 + ", which equals " + (roll1 + roll3) +
                ". " + player2.getName() + " rolled " + roll2 + " and " + roll4 + ", which equals " + (roll2 + roll4) + ".");
        if (roll1 + roll3 > roll2 + roll4) {
            System.out.println((roll1 + roll3) + " is higher than " + (roll2 + roll4) + ". " + player1.getName() + " wins!");
        } else if (roll1 + roll3 < roll2 + roll4) {
            System.out.println((roll2 + roll4) + " is higher than " + (roll1 + roll3) + ". " + player2.getName() + " wins!");
        } else {
            System.out.println((roll2 + roll4) + " and " + (roll1 + roll3) + " are the same. It's a draw!");
        }
    }
}