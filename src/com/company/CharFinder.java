package com.company;

public class CharFinder {
    private final String phrase;


    public CharFinder(String phrase) {
        this.phrase = phrase;
    }

    public int countChars(char foundChar){
        int count = 0;
        char[] phraseArray = phrase.toCharArray();
        for (char token: phraseArray) {
            if(token == foundChar){
                count++;
            }
        }
        return count;
    }


}
