/**
 * @author         Bill Tsui
 * @date           Nov 15 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.basics.operators;

public class ConditionalDemo1 {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        if ((value1 == 1) && (value2 == 2)) {
            IO.println("value1 is 1 AND value2 is 2");
        }

        if ((value1 == 1) || (value2 == 1)) {
            IO.println("value1 is 1 OR value2 is 1");
        }
    }
}
