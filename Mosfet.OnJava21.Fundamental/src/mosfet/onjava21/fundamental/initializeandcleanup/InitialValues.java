/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Oct 28 2025 14:12
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.initializeandcleanup;

public class InitialValues {
    //默认初始化
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues initialValues;

    //指定初始化
    boolean t1 = false;
    char c1 = 'c';
    byte b1 = 127;
    short s1 = 0xff;
    int i1;

    //构造函数初始化
    public InitialValues(int i1) {
        this.i1 = i1;
    }

    void printInitialValues() {
        System.out.println("Data type   Initial Value");
        System.out.println("boolean        " + t);
        System.out.println("char            [" + c + "]");
        System.out.println("byte             " + b);
        System.out.println("short            " + s);
        System.out.println("int              " + i);
        System.out.println("long             " + l);
        System.out.println("float            " + f);
        System.out.println("double           " + d);
        System.out.println("reference        " + initialValues);
        System.out.println("i1               " + i1);
    }

    public static void main(String[] args) {
        new InitialValues(19).printInitialValues();
    }
}
