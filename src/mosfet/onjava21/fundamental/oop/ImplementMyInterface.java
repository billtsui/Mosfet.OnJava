/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 05 2025 18:23
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.oop;

public class ImplementMyInterface implements MyInterface,MyInterface2{
    @Override
    public void MyMethod() {
        System.out.println("ImplementMyInterface.MyMethod");
    }

    @Override
    public int getAge() {
        return 0;
    }
}
