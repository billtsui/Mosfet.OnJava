/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Oct 29 2025 11:06
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.string;

import java.util.Formatter;

public class Format {
    public static void main(String[] args) {
        int x = 10;
        float f = 3.1415926F;
        System.out.printf("%d %.5f%n", x, f);//像C语言一样使用printf

        System.out.format("%d %.5f%n", x, f);//format方法模仿了C语言的print

        //格式化器
        Formatter fmt = new Formatter(System.out);
        fmt.format("%d %.3f%n", x, f);

        /*
         * 格式说明符
         * %[argument_index$][flags][width][.precision]conversion
         */

        System.out.printf("%2$s 是 %1$s%n", "猫", "小黑"); //小黑 是 猫

        System.out.printf("|%8d|", 123);  // 输出: |     123| (默认右对齐，前面有5个空格)
        System.out.printf("%n");

        System.out.printf("|%08d|", 123);  // 输出: |     123| (默认右对齐，空格用0代替)

        System.out.printf("%n");
        System.out.printf("|%-8d|", 123); // 输出: |123     | (左对齐，后面有5个空格)
        System.out.printf("%n");


        System.out.printf("|%-8.4f|",f); // 输出：|3.1416  | (左对齐)
        System.out.printf("%n");

        //precision用在字符类型上指定字符串的最大输出字符
        System.out.printf("%.2s","Hello"); //输出 He
    }
}
