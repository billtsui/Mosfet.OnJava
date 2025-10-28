/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Oct 28 2025 14:28
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.initializeandcleanup;

public class House {
    //类变量先初始化，其次才是构造函数
    Window w1 = new Window(1);

    public House() {
        System.out.println("House()");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);

    void f() {
        System.out.println("f()");
    }

    Window w3 = new Window(3);
}
