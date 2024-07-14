package org.example;

import java.util.*;

public class WordRevealer {

    private HiddenWord hiddenWord;

    private ListIncorrectlyLetters listIncorrectlyLetters;

    private char[] revealed;

    public WordRevealer(RandomWord manager, ListIncorrectlyLetters listIncorrectlyLetters) {
        this.hiddenWord = new HiddenWord(manager.getRandomWord());
        this.listIncorrectlyLetters = listIncorrectlyLetters;
        this.revealed = new char[hiddenWord.getHiddenWord().length()];
        Arrays.fill(revealed, '_');
        revealRandomLetters(2);
    }

    private void revealRandomLetters(int count) {
        Set<Character> revealedLetters = new HashSet<>();
        String word = hiddenWord.getHiddenWord();
        int revealedCount = 0;

        while (revealedCount < count) {


            int item = RandomLetters.randomItem(word);
            char letter = word.charAt(item);

            if (!revealedLetters.contains(letter)) {
                revealedLetters.add(letter);
                revealLetter(letter);
                revealedCount++;
            }
        }
    }




    public String printHiddenWord() {
        return Arrays.toString(revealed);
    }

    public boolean revealLetter(char letter) {
        boolean findLetter = false;
        for (int i = 0; i < hiddenWord.getHiddenWord().length(); i++) {
            if (hiddenWord.getHiddenWord().charAt(i) == letter) {
                revealed[i] = letter;
                findLetter = true;
            }

        }
        if (!findLetter) {
            listIncorrectlyLetters.addLetterIncorractlyList(letter);
            return false;
        }
        return true;
    }

    public String getHiddenWord() {
        return hiddenWord.getHiddenWord();
    }

    public boolean comparison() {
        return hiddenWord.getHiddenWord().contentEquals(new String(revealed));
    }
}
