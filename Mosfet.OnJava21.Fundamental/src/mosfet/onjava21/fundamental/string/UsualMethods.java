/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Oct 29 2025 10:56
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.string;

public class UsualMethods {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(String.join(" ", s1, s2)); //Hello World
        System.out.println(s1.concat(" " + s2));//Hello World
    }
}
