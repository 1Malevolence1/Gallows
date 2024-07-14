package org.example;

import java.util.Scanner;

public class Game {

    private GameLogic gameLogic;
    public Game() {
        gameLogic = new GameLogic();
    }

    public void play() throws Error {
        boolean keepPlaying = true;
        while(keepPlaying) {
            gameLogic.start();
            keepPlaying = promptReplay();
        }
    }

    private boolean promptReplay() {
        System.out.println("Хотите сыграть еще раз? (y/n): ");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine().trim().toLowerCase();
        return response.equals("y") || response.equals("у");
    }

}
