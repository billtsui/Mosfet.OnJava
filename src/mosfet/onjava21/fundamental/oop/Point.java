/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 01 2025 18:13
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.oop;

import java.beans.JavaBean;

public class Point {
    int x;
    int y;

    public Point() {

    }

    /*
     * 必须是第一行调用其他构造函数，才可以用this关键字
     * 并且必须注意 构造函数不能递归调用
     */
    public Point(double x, double y) {
        this();
    }

    /*
     * overload
     * 并且在构造方法的第一行，可以用this关键字调用其他的构造函数
     */
    public Point(int x, int y) {
        this(0.1f, 0.2f);
        this.x = x;
        this.y = y;
    }

    public int printPoint(int x, int y) {
        return x * x + y * y;
    }

    /*
     * 如果如参是int x, int y 也不行。overload 的必要条件是方法签名不一样
     * 方法签名包括 方法名 和 参数列表（包括参数先后顺序）
     * 不包括 方法的返回值和访问修饰符
     *
     * this关键字可以返回当前成员变量
     */
    public Point printPoint(double x, double y) {
        return this;
    }
}
