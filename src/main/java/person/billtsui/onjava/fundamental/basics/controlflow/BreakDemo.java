/**
 * @author         Bill Tsui
 * @date           Nov 16 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.basics.controlflow;


public class BreakDemo {
    public static void main(String[] args) {
        int[] arrayOfInts
                = {32, 87, 3, 589,
                    12, 1076, 2000,
                    8, 622, 127};
        int searchfor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                break;
            }
        }
        if (foundIt) {
            IO.println("Found " + searchfor + " at index " + i);
        } else {
            IO.println(searchfor + " not in array");
        }
    }
}
