/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package person.billtsui.onjava.fundamental.basics.arrays;

/**
 *
 * @author bill
 */
public class ArrayDemo {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];

        // initialize the first element
        anArray[0] = 100;

        //initialize the second element
        anArray[1] = 200;

        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        
        IO.println("Element at index 0: " + anArray[0]);
        IO.println("Element at index 1: " + anArray[1]);
        IO.println("Element at index 2: " + anArray[2]);
        IO.println("Element at index 3: " + anArray[3]);
        IO.println("Element at index 4: " + anArray[4]);
        IO.println("Element at index 5: " + anArray[5]);
        IO.println("Element at index 6: " + anArray[6]);
        IO.println("Element at index 7: " + anArray[7]);
        IO.println("Element at index 8: " + anArray[8]);
        IO.println("Element at index 9: " + anArray[9]);
    }
}
