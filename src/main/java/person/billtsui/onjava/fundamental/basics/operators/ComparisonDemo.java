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

public class ComparisonDemo {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        if (value1 == value2) {
            IO.println("value1 == value2");
        }
        if (value1 != value2) {
            IO.println("value1 != value2");
        }
        if (value1 > value2) {
            IO.println("value1 > value2");
        }
        if (value1 < value2) {
            IO.println("value1 < value2");
        }
        if (value1 <= value2) {
            IO.println("value1 <= value2");
        }
    }
}
