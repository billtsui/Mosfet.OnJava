/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Oct 24 2025 09:30
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.operator;

import java.util.Random;

public class Operator {
    public static void main(String[] args) {
        //-------------------------操作符优先级-------------------------
        int x = 1, y = 2, z = 3;
        int a = x + y - 2 / 2 + z;
        int b = x + (y - 2) / (2 + z);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //---------------------------赋值------------------------------
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println("1: t1.level: " + t1.level + ", 2: t2.level: " + t2.level);
        t1 = t2;
        System.out.println("1: t1.level: " + t1.level + ", 2: t2.level: " + t2.level);
        t1.level = 27;
        System.out.println("1: t1.level: " + t1.level + ", 2: t2.level: " + t2.level);

        Tank t3 = new Tank();
        t3.level = 100;
        System.out.println("1: t3.level: " + t3.level);
        f(t3);
        System.out.println("1: t3.level: " + t3.level);

        //----------------------------算术操作符------------------------------
        // +、-、*、/、%、+=、-=、*=、/=、%=
        Random random = new Random(69);
        int i, j, k;
        i = random.nextInt(100) + 1;
        j = random.nextInt(100) + 1;
        System.out.println("i = " + i + " , j = " + j);
        i++;
        j++;
        System.out.println("i++ = " + i + " , j++ = " + j);
        k = i + j;
        System.out.println("i + j = " + k);
        k = i - j;
        System.out.println("i - j = " + k);
        k = i * j;
        System.out.println("i * j = " + k);
        k = i / j; //truncate小数部分
        System.out.println("i / j = " + k);
        k = i % j;
        System.out.println("i % j = " + k);

        float u, v, w;
        u = random.nextFloat();
        v = random.nextFloat();
        System.out.println("u = " + u + ", v = " + v);
        w = u + v;
        System.out.println("u + v = " + w);
        w = u - v;
        System.out.println("u - v = " + w);
        w = u * v;
        System.out.println("u * v = " + w);
        w = u / v;
        System.out.println("u / v = " + w);
        w = u % v;
        System.out.println("u % v = " + w);

        //-可以反转数字的符号 +可以将变量的数据类型提升为int
        int q = -1;
        System.out.println("q = " + q + ", -q = " + -q);

        //----------------------------关系操作符------------------------------
        // <、>、<=、>=、==、!=
        // == 作用在primitive type是
        Integer i1 = 127;
        Integer i2 = 127;
        showInt("Automatic", i1, i2);

        Integer i3 = new Integer(127); //Java 9 deprecated
        Integer i4 = new Integer(127);
        showInt("new Integer()", i3, i4);

        /*
         * 使用了池化(-128 ~ + 127)技术所以相等
         * 可以用-Djava.lang.Integer.IntegerCache.high=<值>调整上限
         * 但是不能调整下限
         * equals()是Object类所属，用在class里面。Primitive type不用equals
         * 直接使用== 和 !=
         *
         */
        Integer i5 = Integer.valueOf(127);
        Integer i6 = Integer.valueOf(127);
        showInt("Integer.valueOf()", i5, i6);

        Integer i7 = Integer.valueOf(128);
        Integer i8 = Integer.valueOf(128);
        showInt("Integer.valueOf()", i7, i8);

        int i9 = 1_000_000;
        System.out.printf("i9 = %,d\n", i9);//1_000_000这种表示方法看起来很清晰

        /*
         * 浮点数判断是否相等的时候尤其要注意其表示方法
         * equals()默认比较引用是否相等
         * 如果需要比较具体的value，需要重写equals()方法
         * 大多数标准库会重写equals()方法来比较对象的内容而不是它们的引用
         */

    }

    private static void f(Tank t) {
        t.level = -1;
    }

    private static void showInt(String desc, Integer i, Integer j) {
        System.out.println(desc + ":");
        System.out.printf("%d==%d %b  i.equals(j) %b%n", i, j, i == j, i.equals(j));
    }
}
