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

public class UnaryDemo {
    public static void main(String[] args) {
        int  result = +1;
        // result is now 1
        IO.println(result);

        result--;
        // result is now 0
        IO.println(result);

        result++;
        // result is now 1
        IO.println(result);

        result = -result;
        // result is now -1
        IO.println(result);

        boolean success = false;
        // false
        IO.println(success);
        // true
        IO.println(!success);
    }
}
