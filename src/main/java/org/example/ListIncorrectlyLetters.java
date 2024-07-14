package org.example;

import java.util.ArrayList;
import java.util.List;

public class DictionaryLetters {
    private List<String> incorrectlyGuessedLetters;


    public DictionaryLetters() {
        this.incorrectlyGuessedLetters = new ArrayList<>();
    }

    public List<String> addLetterIncorractlyList(String letter){
        return addLetter(incorrectlyGuessedLetters, letter);
    }

    private List<String> addLetter(List<String> list, String letter){
        list.add(letter);
        return list;
    }
}
