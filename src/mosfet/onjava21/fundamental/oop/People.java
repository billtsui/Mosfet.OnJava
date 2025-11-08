/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 03 2025 12:23
 * {@code @Description:}
 * --------------------------------------------------------------------------
 * static 关键字修饰的东西随着类的加载而初始化
 * 静态代码块、静态方法、静态变量等
 * 静态代码块按照书写顺序执行
 * 静态方法可以调用非静态方法，因为静态方法初始化在前
 * 静态方法内部不能使用非静态方法
 */
package mosfet.onjava21.fundamental.oop;

import java.util.Objects;

public class People {
    //类变量 所有实例共享
    public static String gender = "Female";

    //构造块 new object()的时候调用，在构造函数之前
    {
        System.out.println("This is a construct code block.");
    }

    //静态代码块 类初始化的时候调用 只执行一次
    static {
        System.out.println("This is a static code block.");
        //静态代码块可以调用静态方法
        Test();
    }

    //成员变量
    private String name;
    private int age;
    private String nationality;

    public People() {
    }

    public People(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        System.out.println("This is a constructor.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 & age < 150) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        People.gender = gender;
    }

    public static void Test() {
        System.out.println("This is a static method.");
    }

    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age + " Nationality: " + nationality + " Gender: " + gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof People people)) return false;
        return age == people.age && Objects.equals(name, people.name) && Objects.equals(nationality, people.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, nationality);
    }
}
