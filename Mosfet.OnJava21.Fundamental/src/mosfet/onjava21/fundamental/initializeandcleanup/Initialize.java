/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Oct 25 2025 15:40
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.initializeandcleanup;

public class Initialize {

    /*
     * 零参构造函数和overload构造函数
     */
    public Initialize() {
        System.out.println("This is zero args constructor");
    }

    public Initialize(String arg) {
        System.out.println("This is overload constructor" + ",arg is " + arg);
    }

    //-------------------------method overload-------------------------
    public void method() {
    }

    public void method(int arg) {
    }

    public void method(String arg) {
    }

    public void method(int arg, String arg2) {
    }

    public void method(String arg, int arg2) {
    } //参数类型的顺序不同，也可以overload

    //-------------------------提升数据类型的overload-----------------------
    //使用 m1(5) 调用方法，会调用 int 参数的方法。虽然5也是byte类型，但是会自动提升到integer
    public void m1(byte arg) {
        System.out.println("This is byte arg method.");
    }

    public void m1(char arg) {
        System.out.println("This is char arg method.");
    }

    public void m1(int arg) {
        System.out.println("This is int arg method.");
    }
}
