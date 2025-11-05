/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 05 2025 18:31
 * {@code @Description:}
 * --------------------------------------------------------------------------
 * 接口可以继承
 */
package mosfet.onjava21.fundamental.oop;

public interface MyInterface3 extends MyInterface,MyInterface2 {
    /**
     * Java 8 使用 default 关键字可以实现具体方法
     */
    public default void myMethod() {
        System.out.println("MyInterface3::myMethod");
    }
}
