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

public class DoWhileDemo {
    public static void main(String[] args) {
        int count = 1;
        do {
            IO.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}
