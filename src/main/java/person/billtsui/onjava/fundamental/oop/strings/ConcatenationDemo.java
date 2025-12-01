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

public class ConcatenationDemo {
    public static void main(String[] args) {
        // Using + operator
        String firstName = "Java";
        String lastName = "Developer";
        String fullName = firstName + " " + lastName;
        IO.println("Full name: " + fullName);

        // Using concat() method
        String greeting = "Hello, ".concat(fullName).concat("!");
        IO.println(greeting);

        //Mixing different types
        int age = 25;
        String info = "I am " + age + " years old.";
        IO.println(info);
    }
}
