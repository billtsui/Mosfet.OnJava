/**
 * @author         Bill Tsui
 * @date           Dec 05 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.oop.strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
       String palindrome = "Dot saw I was Tod";

       StringBuilder sb = new StringBuilder(palindrome);
       sb.reverse(); //reverse it
       IO.println(sb.toString());
    }
}
