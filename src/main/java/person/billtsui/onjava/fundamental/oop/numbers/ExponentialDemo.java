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

public class ExponentialDemo {
    public static void main(String[] args) {
        double x = 11.635;
        double y = 2.76;
        
        System.out.printf("The value of e is %.4f%n", Math.E);
        System.out.printf("exp(%.3f) is %.3f%n", x, Math.exp(x));
        System.out.printf("log(%.3f) is %.3f%n", x, Math.log(x));
        System.out.printf("pow(%.3f, %.3f) is %.3f%n", x, y, Math.pow(x, y));
        System.out.printf("sqrt(%.3f) is %.3f%n", x, Math.sqrt(x));
    }
}
