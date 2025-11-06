/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 06 2025 11:18
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.oop;

/**
 * 普通类
 */
public class OrdinaryClass {
    private int age = 18;

    /**
     * 普通内部类
     * 普通内部类和实例是一个层级，所以需要先 new Instance() 然后才能访问
     * <p>
     * 改成 private 后只能在当前类内部使用
     */
    public class NormalInnerClass {
        private int age;

        public NormalInnerClass(int age) {
            setAge(age);
            System.out.println("普通内部类的无参构造函数");
        }

        public void show() {
            System.out.println("外部变量 " + age);
        }

        public void test(int age) {
            System.out.println("形参age " + age);
            System.out.println("当前类的age " + this.age);
            System.out.println("外部类的age " + OrdinaryClass.this.age);
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    /**
     * 静态内部类属于类层级
     */
    public static class StaticInnerClass {
        private int age;

        public StaticInnerClass(int age) {
            setAge(age);
        }

        public void show(int age) {
            System.out.println("形参age  "+ age);
            System.out.println("当前类类的age  "+ this.age);
            //System.out.println("外部类的age "+ NormalInnerClass.this.age); 静态内部类不能访问外部类的成员变量
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
