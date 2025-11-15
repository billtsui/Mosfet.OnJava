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

public class ArithmeticDemo {
    public static void main(String[] args) {
        int result = 1 + 2;
        //result is now 3
        IO.println("1 + 2 = " + result);
        int original_result = result;

        result = result - 1;
        // result is now 2
        IO.println(original_result + " - 1 = " + result);
        original_result = result;

        result = result * 2;
        // result is now 4
        IO.println(original_result + " * 2 = " + result);
        original_result = result;

        result = result / 2;
        // result is now 2
        IO.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result + 8;
        // result is now 10
        IO.println(original_result + " + 8 = " + result);
        original_result = result;

        result = result % 7;
        // result is now 3
        IO.println(original_result + " % 7 = " + result);
    }
}