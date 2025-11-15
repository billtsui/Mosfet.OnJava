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

public class ArrayCalculation {
    public static void main(String[] args) {
        // Array calculations
        int[] values = {12, 8, 15, 3, 9, 21};
        int sum = 0;
        int max = values[0];
        int min = values[0];

        //Calculate sum, max, and min
        for (int value : values) {
            sum += value;
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }

        double average = (double) sum / values.length;

        IO.println("Array: " + Arrays.toString(values));
        IO.println("Sum: " + sum);
        IO.println("Average: " + average);
        IO.println("Maximum: " + max);
        IO.println("Minimum: " + min);

        // Try with different numbers
        int[] moreNumbers = {45, 23, 67, 12, 89, 34};
        int total = 0;
        for (int number : moreNumbers) {
            total += number;
        }

        IO.println("");
        IO.println("Second array: " + Arrays.toString(moreNumbers));
        IO.println("Total of second array: " + total);
    }
}
