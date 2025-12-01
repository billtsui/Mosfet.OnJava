/**
 * @author         Bill Tsui
 * @date           Dec 01 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.oop.strings;

public class ValueOfDemo {
    public static void main(String[] args) {
        // this program requires two
        // arguments on the command line
        if (args.length == 2) {
            // convert strings to numbers
            float a = (Float.valueOf(args[0])).floatValue();
            float b = (Float.valueOf(args[1])).floatValue();

            // do some arithmetic
            IO.println("a + b = " + (a + b));
            IO.println("a - b = " + (a - b));
            IO.println("a * b = " + (a * b));
            IO.println("a / b = " + (a / b));
            IO.println("a % b = " + (a % b));
        } else {
            IO.println("This program requires two command-line arguments.");
        }
    }
}
