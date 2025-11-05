/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 05 2025 14:43
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.oop;

/*
 * 继承抽象类后需要实现抽象方法
 */
public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void call(String name) {
        System.out.println("The cat " + name + " is a " + this.getClass().getSimpleName());
    }
}
