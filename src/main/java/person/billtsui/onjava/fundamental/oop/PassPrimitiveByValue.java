/**
 * @author         Bill Tsui
 * @date           Nov 18 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.oop;


public class PassPrimitiveByValue {
    public static void main(String[] args) {
        int x = 3;

        // invoke passMethod() with
        // x as argument
        passMethod(x);

        // print x to see if its
        // value has changed
        IO.println("After invoking passMethod, x = " + x);
    }

    public static void passMethod(int p) {
        p = 10;
    }
}
