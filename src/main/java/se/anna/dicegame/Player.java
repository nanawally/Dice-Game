package se.anna.dicegame;

import java.util.Scanner;

public class Player {
    public String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    static void playerNames(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1, choose your name");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Player 2, choose your name");
        Player player2 = new Player(scanner.nextLine());

        System.out.println("Welcome, " + player1.getName() + " and " + player2.getName() + "!");
    }
}
