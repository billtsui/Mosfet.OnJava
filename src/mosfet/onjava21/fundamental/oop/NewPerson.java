/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 04 2025 13:40
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.oop;

public class NewPerson {
    private String name;
    private short age;

    public NewPerson() {
        System.out.println("NewPerson() constructor called");
    }

    public NewPerson(String name, short age) {
        setAge(age);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        if (age > 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public void show() {
        System.out.println("My name is " + getName() + ". I am " + getAge() + " years old.");
    }

    public void eat(String food) {
        System.out.println("I am  eating " + food);
    }

    public NewPerson returnParent(String name) {
        return new NewPerson();
    }
}
