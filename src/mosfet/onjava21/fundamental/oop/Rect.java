/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 05 2025 13:20
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.oop;

import java.awt.*;

public class Rect extends Shape {
    private int length;
    private int width;

    public Rect() {
    }

    public Rect(int x, int y, int length, int width) {
        super(x, y);
        setLength(length);
        setWidth(width);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Invalid length");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Invalid width");
        }
    }

    public void draw(int x, int y, int length, int width) {

    }

    @Override
    public String toString() {
        return "Rect{" +
                " x=" + super.getX() +
                ", y=" + super.getY() +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
