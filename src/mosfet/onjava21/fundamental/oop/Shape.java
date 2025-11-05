/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 05 2025 13:20
 * {@code @Description:}
 * --------------------------------------------------------------------------
 * 多态实现的三个必须的条件
 * 1、继承关系
 * 2、override父类中的方法
 * 3、必须使用父类引用指向子类对象
 *
 * 引用类型的转换是父子类之间的转换，非父子关系的两个类不能相互转换
 * 在强制类型转换前，应用 instanceof 操作符进行类型判断
 */
package mosfet.onjava21.fundamental.oop;

public class Shape {
    private int x;
    private int y;

    public Shape() {
    }

    public Shape(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
