package com.company;

public class WordsFinder {
    private final String phrase;

    public WordsFinder(String phrase) {
        this.phrase = phrase;
    }

    public String[] getWords(){
        String[] words = phrase.split(" ");
        return words;
    }
}
