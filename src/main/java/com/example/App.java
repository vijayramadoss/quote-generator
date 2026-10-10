package com.example;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        String[] quotes = {
            "Code is like humor. When you have to explain it, it’s bad.",
            "Fix the cause, not the symptom.",
            "Simplicity is the soul of efficiency.",
            "Make it work, make it right, make it fast."
        };
        String selectedQuote = quotes[new Random().nextInt(quotes.length)];
        System.out.println("==========================================");
        System.out.println("   UNIQUE JAVA CI/CD QUOTE GENERATOR     ");
        System.out.println("==========================================");
        System.out.println("Today's Wisdom: " + selectedQuote);
        System.out.println("==========================================");
    }
}