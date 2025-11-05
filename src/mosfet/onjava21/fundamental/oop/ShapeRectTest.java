/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 05 2025 13:28
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.oop;


public class ShapeRectTest {
    public static void main(String[] args) {
        Shape shape = new Shape(5, 5);
        System.out.println("shape:" + shape.toString());
        Rect rectangle = new Rect(6, 6, 10, 10);
        System.out.println("rectangle:" + rectangle.toString());
        Shape shape1 = new Rect(7, 7, 9, 9);
        System.out.println("shape1:" + shape1.toString());
    }
}
