package org.example;

import java.util.Random;

public class RandomLetters {


    public static int randomItem(String word){
        Random random = new Random();
        return random.nextInt(word.length());
    }


}
