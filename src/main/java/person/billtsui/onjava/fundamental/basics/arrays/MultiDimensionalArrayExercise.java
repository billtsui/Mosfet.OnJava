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

public class MultiDimensionalArrayExercise {
    public static void main(String[] args) {
        // Multidimensional arrays (2D array)
        int[][] martix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        IO.println("3x3 Matrix:");
        for (int i = 0; i < martix.length; i++) {
            for (int j = 0; j < martix[i].length; j++) {
                IO.print(martix[i][j] + " ");
            }
            IO.println(""); // New line after each row
        }

        // Try a  different shaped matrix
        String[][] schedule = {
            {"Math", "Science", "English"},
            {"HIstory", "Art", "PE"},
            {"Music", "Computer", "Study Hall"}
        };

        IO.println("");
        IO.println("Class Schedule:");
        String[] periods = {"Period 1", "Period 2", "Period 3"};
        for (int day = 0; day < periods.length; day++) {
            IO.println("Day " + (day + 1) + ":");
            for (int period = 0; period < schedule[day].length; period++) {
                IO.println("  " + periods[period] + ": " + schedule[day][period]);
            }
        }
    }
}
