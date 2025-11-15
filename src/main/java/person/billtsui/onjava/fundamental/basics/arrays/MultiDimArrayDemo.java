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

public class MultiDimArrayDemo {

    public static void main(String[] args) {
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };

        // Mr.Smith
        IO.println(names[0][0] + names[1][0]);
        // Ms.Jones
        IO.println(names[0][2] + names[1][1]);

        IO.println("================================");

        String[][] strings = {
            {"one"},
            {"Maria", "Jennifer", "Particia"},
            {"James", "Michael"},
            {"Washington", "London", "Paris", "Berlin", "Tokyo"}
        };
        displayBidimensionalArray(strings);
    }

    static void displayBidimensionalArray(String[][] strings) {
        for (int arrayIndex = 0; arrayIndex < strings.length; arrayIndex++) {
            for (int index = 0; index < strings[arrayIndex].length; index++) {
                IO.print(strings[arrayIndex][index] + " ");
            }
            IO.println();
        }
    }
}
