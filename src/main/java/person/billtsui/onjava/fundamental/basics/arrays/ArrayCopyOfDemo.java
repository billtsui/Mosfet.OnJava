/**
 * @author         Bill Tsui
 * @date           Nov 15 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.basics.arrays;

import java.util.Arrays;

public class ArrayCopyOfDemo {
    public static void main(String[] args) {
         String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
            "Marocchino", "Ristretto"};
        String[] copyTo = Arrays.copyOfRange(copyFrom, 2, 9);

        Arrays.stream(copyTo).map(coffee -> coffee + " ").forEach(IO::print);

        IO.println("");
        IO.println("===========================================================");
        for (String coffee : copyTo) {
            IO.print(coffee + " ");
        }
        IO.println();
        IO.println(Arrays.toString(copyTo));
    }
}
