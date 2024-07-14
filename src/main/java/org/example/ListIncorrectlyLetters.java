package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListIncorrectlyLetters {
    private Set<Character> incorrectlyGuessedLetters;


    public ListIncorrectlyLetters() {
        incorrectlyGuessedLetters = new HashSet<>();
    }

    public void addLetterIncorractlyList(Character letter){
        incorrectlyGuessedLetters.add(letter);
    }
    public Set<Character> getIncorrectlyGuessedLetters() {
        return incorrectlyGuessedLetters;
    }


    public void printListIncorrectlyLetters(){
         System.out.println("Неверные буквы: " + incorrectlyGuessedLetters);
    }

    public void clear(){
        incorrectlyGuessedLetters.clear();
    }
}
