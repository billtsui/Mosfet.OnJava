/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 06 2025 11:30
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.oop;

public class InnerClassTest {
    public static void main(String[] args) {
        //声明普通内部类
        OrdinaryClass on = new OrdinaryClass();
        OrdinaryClass.NormalInnerClass normalInnerClass = on.new NormalInnerClass(10);
        normalInnerClass.show();
        normalInnerClass.test(11);

        //静态内部类
        OrdinaryClass.StaticInnerClass staticInnerClass = new OrdinaryClass.StaticInnerClass(10);
        staticInnerClass.show(15);

        //局部内部类
        InnerClassTest innerClassTest = new InnerClassTest();
        innerClassTest.localInnerClass();

        /*
         * 回调模式&匿名内部类
         * 匿名内部类没有类名，所以叫匿名内部类
         */
        innerClassTest.testMethod(new MyInterface() {
            @Override
            public void MyMethod() {
                System.out.println("这是一个匿名内部类");
            }
        });

        //枚举类型
        Enumeration friday = Enumeration.Friday;
        System.out.println(friday.getName());
        System.out.println(friday.getValue());
        System.out.println(friday.toString());
    }

    public void choose(Enumeration enumeration) {
        switch (enumeration) {
            case Sunday:
                break;
            case Friday:
                System.out.println(Enumeration.Friday.getName());
                break;
            default:
                System.out.println("Default");
                break;
        }
    }

    public void testMethod(MyInterface myInterface) {
        myInterface.MyMethod();
    }

    public void localInnerClass() {
        class LocalInnerClass {
            private String name;

            public LocalInnerClass(String name) {
                setName(name);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void show() {
                System.out.println("Name: " + name);
            }
        }
        System.out.println("这是一个局部内部类");
        LocalInnerClass localInnerClass = new LocalInnerClass("Bill");
    }
}
