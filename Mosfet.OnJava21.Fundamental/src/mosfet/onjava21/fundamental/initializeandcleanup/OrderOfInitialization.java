/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Oct 28 2025 14:27
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.initializeandcleanup;

/**
 * 演示对象初始化顺序
 * 按照代码的顺序初始化，即使有构造函数
 */
public class OrderOfInitialization {
    public static void main(String[] args) {
        House house = new House();
        house.f();
    }
}
