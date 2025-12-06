/**
 * @author         Bill Tsui
 * @date           Dec 06 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.oop.strings;

import java.util.List;
import java.util.ArrayList;

public class Unboxing {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(-8);

        // 1. Unboxing through method invocation
        int absVal = absoluteValue(i);
        IO.println("absolute value of " + i + " = " + absVal);

        List<Double> doubles = new ArrayList<>();
        doubles.add(3.1416); // Π is autoboxed through method invocation

        // 2. Unboxing through assignment
        double pi = doubles.get(0);
        IO.println("pi = " + pi);
    }

    public static int absoluteValue(int i){
        return i < 0 ? -i : i;
    }
}
