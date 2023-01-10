package org.launchcode.java.studios.charactercount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void  main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a string and I will count all the different characters for you!");
        String str = input.nextLine();
        HashMap<String, Integer> counts = Counter.charCounter(str);
        for (Map.Entry<String, Integer> count: counts.entrySet()
             ) {
            System.out.println(count);
        }

    }
}
