/**
 * @author         Bill Tsui
 * @date           Nov 15 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.basics.arrays;

import java.util.Arrays;

public class ArrayCopyingExercise {
    public static void main(String[] args) {
        // Array copying
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[original.length];

        // Manual copy
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        IO.println("Original: " + Arrays.toString(original));
        IO.println("Copy: " + Arrays.toString(copy));

        // Modify copy to show  they are independent
        copy[0] = 999;
        copy[4] = 777;

        IO.println("");
        IO.println("After modifying the copy:");
        IO.println("Original: " + Arrays.toString(original));
        IO.println("Copy: " + Arrays.toString(copy));

        // System.arraycopy example
        int[] source = {10, 20, 30, 40, 50};
        int[] destination = new int[5];
        System.arraycopy(source, 0, destination, 0, source.length);

        IO.println("");
        IO.println("Using System.arraycopy: ");
        IO.println("Source: " + Arrays.toString(source));
        IO.println("Destination: " + Arrays.toString(destination));
    }
}
