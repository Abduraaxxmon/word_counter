package com.example.java_pandas;

import java.util.List;

public class WordCounter {
    public String takeWord(String word, int n) {
        List<String> wordList = List.of(word.split(" "));
        return wordList.get(n+1);
    }
}
