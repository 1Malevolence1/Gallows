package org.example;

import java.util.Locale;

public class HiddenWord {
    private String hiddenWord;

    public HiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord.trim().toLowerCase();
    }

    public String getHiddenWord() {
        return hiddenWord;
    }


}
