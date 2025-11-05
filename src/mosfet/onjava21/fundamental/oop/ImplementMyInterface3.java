/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 05 2025 18:32
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.oop;

public class ImplementMyInterface3 implements MyInterface3{
    @Override
    public void MyMethod() {
        System.out.println("ImplementMyInterface3");
    }

    @Override
    public int getAge() {
        return 0;
    }

    /*
     * 可以不override default方法
     */
    @Override
    public void myMethod() {
        System.out.println("ImplementMyInterface3");
    }
}
