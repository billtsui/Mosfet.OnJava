/**
 * @author         Bill Tsui
 * @date           Nov 16 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.basics.operators;

public class BlockDemo {
    public static void main(String[] args) {
        boolean condition = true;
        if (condition) { // begin block 1
            IO.println("Condition is true");
        }// end block one
        else { // begin block 2
            IO.println("Condition is false");
        } // end block 2
    }
}
