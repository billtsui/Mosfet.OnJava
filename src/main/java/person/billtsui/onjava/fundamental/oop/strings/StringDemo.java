/**
 * @author         Bill Tsui
 * @date           Nov 27 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.oop.strings;

public class StringDemo {
    public static void main(String[] args) {
        // String literal
        String greeting = "Hello world!";
        IO.println("Greeting: " + greeting);

        // From character array
        char[] helloArray = { 'H', 'e', 'l', 'l', 'o' };
        String helloString = new String(helloArray);
        IO.println("From Array: " + helloString);

        // Try creating your own string!
        String myString = "Your message here.";
        IO.println("My String: " + myString);
    }
}
