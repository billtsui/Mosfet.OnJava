/**
 * @author         Bill Tsui
 * @date           Nov 20 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.oop.klass;


public class DataStructure {

    // Create an array
    private final static int SIZE = 15;
    private final int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        // Fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {
        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            IO.print(iterator.next() + " ");
        }
        IO.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> {}

    public class EvenIterator implements DataStructureIterator {

        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        @Override
        public boolean hasNext() {
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        @Override
        public Integer next() {
            // Record a value of an even index of the array
            Integer retValue = arrayOfInts[nextIndex];

            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }

    public static void main(String[] args) {

        // Fill the array with integer values and print out only values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
