package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.Random;

public class HiddenWordManager {

    private HiddenWord hiddenWord;

    private ListIncorrectlyLetters listIncorrectlyLetters;

    private char[] revealed;

    public HiddenWordManager(DictionaryManager manager) {
        this.hiddenWord = new HiddenWord(manager.getRandomWord());
        this.listIncorrectlyLetters = new ListIncorrectlyLetters();
        this.revealed = new char[hiddenWord.getHiddenWord().length()];
        Arrays.fill(revealed, '_');
        revealed = printStartGameHiddenWord();
    }

    public String printHiddenWord(){
        return Arrays.toString(revealed);
    }

    public char[] printStartGameHiddenWord() {
        int count = 0;

        while (count < 2) {
            char letter = randomLetter();

            for (int item = 0; item < hiddenWord.getHiddenWord().length(); item++) {

                if (hiddenWord.getHiddenWord().charAt(item) == letter) {
                    revealed[item] = letter;
                    count++;
                }
            }
        }
        return revealed;
    }

    public boolean revealLetter(char letter){
        boolean findLetter = false;
        for (int i = 0; i < hiddenWord.getHiddenWord().length(); i++) {
            if(hiddenWord.getHiddenWord().charAt(i) == letter){
                revealed[i] = letter;
                findLetter = true;
            }

        }
        if(!findLetter) {
            listIncorrectlyLetters.addLetterIncorractlyList(letter);
            return false;
        }
        return true;
    }

    public void printListIncorrectlyLetters(){
        if(listIncorrectlyLetters == null) System.out.println();
        else System.out.println("Неверные буквы: " + listIncorrectlyLetters.getIncorrectlyGuessedLetters());
    }
    private char randomLetter(){
        String[] letters = hiddenWord.getHiddenWord().split("");;
        int item = (int) Math.floor(Math.random() * letters.length);
        return letters[item].charAt(0);
    }

    public String getHiddenWord(){
        return hiddenWord.getHiddenWord();
    }

    public boolean comparison(){
        StringBuilder stringBuilder = new StringBuilder();
        for (char letter: revealed
             ) {
            stringBuilder.append(letter);
        }
        return hiddenWord.getHiddenWord().contentEquals(stringBuilder);
    }
}
