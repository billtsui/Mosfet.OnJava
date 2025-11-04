/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 03 2025 12:50
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.oop;

public class PeopleTest {
    public static void main(String[] args) {
        People p = new People("Bill",36,"China");
        p.setGender("Male");
        People p2 = new People("John",35,"UK");
        System.out.println(p.toString());
        System.out.println(p2.toString());
    }
}
