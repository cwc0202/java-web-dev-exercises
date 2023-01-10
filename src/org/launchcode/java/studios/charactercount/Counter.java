package org.launchcode.java.studios.charactercount;

import java.util.HashMap;

public class Counter {

    public static HashMap<String, Integer> charCounter(String str){
        HashMap<String, Integer> counts = new HashMap<>();

        for (int i=0; i<str.length(); i++) {
            char cha = str.charAt(i);
            String key = Character.toString(cha);
            if(!counts.containsKey(key)){
                counts.put(key, 1);
                continue;
            }
            counts.put(key, counts.get(key) + 1);
        }

        return counts;
    }
}
