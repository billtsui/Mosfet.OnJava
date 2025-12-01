/**
 * @author         Bill Tsui
 * @date           Dec 01 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.oop.strings;

public class PracticeIndexAndSubString {
    public static void main(String[] args) {
        String sentence = "Java programming is fun!";

        // String length
        IO.println("Length:" + sentence.length());

        // Get character at specific position
        char firstChar = sentence.charAt(0);
        char lastChar = sentence.charAt(sentence.length() - 1);
        IO.println("First char: " + firstChar);
        IO.println("Last char: " + lastChar);

        // Extract substring
        String word1 = sentence.substring(0,4); // "Java"
        String word2 = sentence.substring(5,16); // "programming"
        String fromIndex = sentence.substring(17); // "is fun!"
        
        IO.println("Word1: " + word1);
        IO.println("Word2: " + word2);
        IO.println("From index 17: " + fromIndex);
    }
}
