package org.example;

import java.util.Random;

public class DictionaryManager {


    private final Dictionary dictionary;
    public DictionaryManager( ) {
        this.dictionary = new Dictionary();
    }

    public String getRandomWord(){
        Random random = new Random();
        return dictionary.getDictionary().get(random.nextInt(dictionary.getDictionary().size()));
    }
}
