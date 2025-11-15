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

public class PrePostDemo {
    public static void main(String[] args) {
        int i = 3;
        i++;
        // prints 4
        IO.println(i);
        ++i;
        // prints 5
        IO.println(i);
        // prints 6
        IO.println(++i);
        // prints 6
        IO.println(i++);
        // prints 7
        IO.println(i);
    }
}
