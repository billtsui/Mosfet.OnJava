/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 01 2025 17:37
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.oop;

public class TestOOP {
    public static void main(String[] args) {
        Person person = new Person("Bill");
        person.age = 22;
        person.printName();

        Point point = new Point(3, 5);
        System.out.println("Point x: " + point.x + ". Point x: " + point.y);

        //封装成员变量。成员变量私有化，使用Get() Set()方法
        Student student = new Student();
        student.setName("Bill");
        student.setAge(-1);
        System.out.println(student.toString());
    }
}
