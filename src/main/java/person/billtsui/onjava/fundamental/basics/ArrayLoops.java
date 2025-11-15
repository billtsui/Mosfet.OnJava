/**
 * @author         Bill Tsui
 * @date           Nov 14 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.basics;

public class ArrayLoops {

    public static void main(String[] args) {

        // Enhanced for loop(for-each)
        int[] scores = {95, 87, 92, 78, 85};
        IO.println("Test scores using enhanced for loop:");
        for (int score : scores) {
            IO.println("Scores: " + score);
        }

        // Different data types
        double[] temperatures = {20.5, 25.0, 18.3, 30.2};
        boolean[] flags = {true, false, true, false, true};
        char[] letters = {'a', 'b', 'c', 'd', 'e'};

        IO.println("");
        IO.println("Temperatures:");
        for (double temp : temperatures) {
            IO.println(temp + "°C");
        }

        IO.println("");
        IO.println("Boolean flags:");
        for (int i = 0; i < flags.length; i++) {
            IO.println("Flag " + i + ": " + flags[i]);
        }

        IO.println("");
        IO.println("Character letters:");
        for (char letter : letters) {
            IO.println("Letter: " + letter);
        }
    }
}
