/**
 * @author         Bill Tsui
 * @date           Nov 22 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.oop.enums;

public enum MyEnum {
    A() {
        @Override
        void doSomething() {
            IO.println("A");
        }
    },
    B() {
        @Override
        void doSomething() {
            IO.println("B");
        }
    };
    
    abstract void doSomething();
}
