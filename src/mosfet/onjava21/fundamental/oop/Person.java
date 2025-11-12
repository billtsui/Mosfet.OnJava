/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 01 2025 17:35
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.oop;

public class Person {
    String name;
    int age;

    public Person(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println("My name is " + this.name + ". I am  " + this.age + " years old.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
