/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 04 2025 13:40
 * {@code @Description:}
 * --------------------------------------------------------------------------
 * ********************执行次序********************
 * 父类静态代码块
 * 子类静态代码块
 * 父类构造代码块
 * 父类构造方法体
 * 子类构造代码块
 * 子类构造方法体
 */
package mosfet.onjava21.fundamental.oop;

//静态导入

import static java.lang.System.out;

/**
 * finale修饰的类不能被inherit
 */
public /*final*/ class NewPerson {
    private String name;
    private short age;
    /*
     * final修饰的变量必须被显式初始化，并且不能被修改
     * 亦可在构造函数中初始化、构造代码块中初始化
     */
    private final String type = "Human";

    public NewPerson() {
        out.printf("%d\n", 10);
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

    /**
     * final修饰的方法不能被override
     *
     * @param name
     * @return
     */
    public /*final*/ NewPerson returnParent(String name) {
        return new NewPerson();
    }
}
