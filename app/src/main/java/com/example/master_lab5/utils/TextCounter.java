package com.example.master_lab5.utils;

public class TextCounter {
    public static int getCharsCount(String phrase){
        if(phrase!=null){
            return phrase.length();
        }
        return -1;
    }
    public static int getWordsCount(String phrase) {
        return phrase.length();
    }
}