/**
 * @author         Bill Tsui
 * @date           Nov 15 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.basics.operators;

public class InstanceOfDemo {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        IO.println("obj1 instanceof Parent: " + (obj1 instanceof Parent));
        IO.println("obj1 instanceof Child: " + (obj1 instanceof Child));
        IO.println("obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface));

        IO.println("obj2 instanceof Parent: " + (obj2 instanceof Parent));
        IO.println("obj2 instanceof Child: " + (obj2 instanceof Child));
        IO.println("obj2 instanceof MyInterface: " + (obj2 instanceof MyInterface));
    }
}


class Parent{}
interface MyInterface{}
class Child extends Parent implements MyInterface{}
