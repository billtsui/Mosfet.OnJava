/**
 * @author         Bill Tsui
 * @date           Nov 16 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.basics.controlflow;


public class ContinueWithLabelDemo {
    public static void main(String[] args) {
        String searchMe = "Look for a substring in this string.";
        String subString = "str";
        boolean foundIt = false;

        int max = searchMe.length() - subString.length();

        test:
        for (int i = 0; i <= max; i++) {
            int n = subString.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (searchMe.charAt(j++) != subString.charAt(k++)) {
                    continue test;
                }
            }
            foundIt = true;
            break test;
        }
        IO.println(foundIt ? "Found it" : "Didn't find it");
    }
}
