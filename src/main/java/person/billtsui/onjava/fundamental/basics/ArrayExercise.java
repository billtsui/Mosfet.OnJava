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

public class ArrayExercise {

    public static void main(String[] args) {
        // Basic array creation and initialization
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Print array elements using a loop
        IO.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            IO.println("Element at index " + i + ": " + numbers[i]);
        }

        // Array initialization  shorthand
        // 长姿势了 date 是植物椰枣的英文
        String[] fruits = {"apple", "banana", "cherry", "date"};
        IO.println("");
        IO.println("Fruis array:");
        for (int i = 0; i < fruits.length; i++) {
            IO.println(i + ": " + fruits[i]);
        }

        // Try creating your own arrays!
        double[] prices = {9.99, 15.50, 7.25};
        IO.println("");
        IO.println("Prices:");
        for (double price : prices) {
            IO.println("$" + price);
        }
    }
}
