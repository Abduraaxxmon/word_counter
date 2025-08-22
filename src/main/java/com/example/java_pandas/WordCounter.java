package com.example.java_pandas;

import java.util.List;

public class WordCounter {
    public String takeWord(String word, int n) {
        try{
            if (word==null ||word.isBlank()) {
                return "Invalid input: text is null or empty";

            }
            List<String> wordList = List.of(word.split(" "));
            return wordList.get(n+1);

        }catch (IndexOutOfBoundsException e) {
            return "Invalid index: "+ n + " size= "+word.length();

        }
    }
}
