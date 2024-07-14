package org.example;

import java.util.Random;

public class RandomWord {


    private final ListWordsForGame list;
    public RandomWord( ) {
        this.list = new ListWordsForGame();
    }

    public String getRandomWord(){
        Random random = new Random();
        return list.getDictionary().get(random.nextInt(list.getDictionary().size()));
    }
}
