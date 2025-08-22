package com.example.java_pandas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            System.out.println("Enter sentence: ");
            String sentence = String.valueOf(in.nextLine());

            System.out.println("Enter number: ");
            Integer word = Integer.valueOf(in.nextLine());


            WordCounter obj = new WordCounter();
            System.out.println(obj.takeWord(sentence,word));


    }
}