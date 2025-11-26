/**
 * @author         Bill Tsui
 * @date           Nov 26 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.oop.numbers;

import java.text.DecimalFormat;

public class DecimalFormatDemo {
    public static void main(String[] args) {
        customFormat("###,###.###", 123456.789);
        customFormat("###.##", 123456.789);
        customFormat("$###,###.###", 123456.789);
        customFormat("000000.000", 123.78);
    }

    public static void customFormat(String pattern, double value) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        IO.println(value + "    " + pattern + "    " + output);
    }
}
