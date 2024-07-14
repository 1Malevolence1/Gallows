package org.example;

import java.util.Scanner;

public class Player {

    private int life = 9;
    private  Scanner scanner;

    public Player() {
        this.scanner = new Scanner(System.in);
    }

    public Character sayLetter(){
        String input = scanner.nextLine().trim().toLowerCase();
        if(input.length() != 1 ) {
            System.out.println("Ввидите одну букву");
            return sayLetter();
        }
        return input.charAt(0);
    }

    public void decrementLife() {
        this.life--;
        System.out.println("Осталось попыток: " + life);
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
