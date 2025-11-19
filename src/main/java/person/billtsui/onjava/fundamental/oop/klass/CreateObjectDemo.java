/**
 * @author         Bill Tsui
 * @date           Nov 18 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.oop.klass;

public class CreateObjectDemo {
    public static void main(String[] args) {
        // Declare and create a point object and two rectangle objects.
        Point originOne = new Point(23, 94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);

        // display rectOne's width, height, and area
        IO.println("Width of rectOne: " + rectOne.width);
        IO.println("Height of rectOne: " + rectOne.height);
        IO.println("Area of rectOne: " + rectOne.getArea());

        // set rectTwo's position
        rectTwo.origin = originOne;

        // display rectTwo's position
        IO.println("X position of rectTwo: " + rectTwo.origin.x);
        IO.println("Y position of rectTwo: " + rectTwo.origin.y);

        // move rectTwo and display its new position
        rectTwo.move(40, 72);
        IO.println("X position of rectTwo: " + rectTwo.origin.x);
        IO.println("Y position of rectTwo: " + rectTwo.origin.y);
    }
}
