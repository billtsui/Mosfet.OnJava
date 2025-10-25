/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Oct 24 2025 19:29
 * {@code @Description:}
 * --------------------------------------------------------------------------
 * if-else、while、do-while、for、for-in、return、continue、break、goto
 * 重复的事情使用循环完成，计算机就是在做重复的事情。
 */
package mosfet.onjava21.fundamental.controlflow;

import java.util.Random;

public class ControlFlow {
    static int result = 0;

    public static void main(String[] args) {
        compareTwoNums(5, 10);
        System.out.println(result);
        compareTwoNums(10, 5);
        System.out.println(result);
        compareTwoNums(5, 5);
        System.out.println(result);
        System.out.println("---------------------------");
        //-------------------while-------------------
        int i = 10, j = 15;
        while (i < j) {
            i++;
            System.out.println(i);
        }
        System.out.println("-----------------------------");

        //------------------do-while--------------------
        //do-while中的语句至少执行一次
        int k = 10, l = 15;
        do {
            k++;
            System.out.println(k);
        } while (k < l);

        for (char c = 0; c < 128; c++) {
            if (Character.isLowerCase(c)) {
                System.out.printf("%c", c);
            }
        }
        System.out.printf("%n");

        Random random = new Random(69);
        float[] array = new float[10];
        for (int p = 0; p < 10; p++) {
            array[p] = random.nextFloat();
        }

        for (float f : array) {
            System.out.printf("%f ", f);
        }

        System.out.printf("%n");
        for (char c : "Hello World!".toCharArray()) {
            System.out.printf("%c ", c);
        }

        for (int h = 0; h < 5; h++) {
            for (int w = 0; w < 5; w++) {
                if (w == 3) break; //中断作用域内的循环
                System.out.printf("%d", w);
            }
            System.out.printf("%n");
        }

        for (int h = 0; h < 5; h++) {
            for (int w = 0; w < 5; w++) {
                if (w == 3) continue; //跳过当前的循环参数，继续下一次循环
                System.out.printf("%d", w);
            }
            System.out.printf("%n");
        }
        System.out.println("----------------break label---------------------------------");
        /*
         * 编程语言的哲学性：真正的问题并不在于goto语句本身，而在于滥用goto。如何界定滥用？公说公有理，婆说婆有理。
         * 标签可以中断所有循环并继续执行后面的语句，这在有些时候是非常必要的。因为return无法继续执行后面的语句。
         * 使用标签的唯一理由就是用到了嵌套循环，而且你需要使用break和continue来跳出多层的循环。
         */
        labelTest:
        for (int h = 0; h < 5; h++) {
            for (int w = 0; w < 5; w++) {
                if (w == 3) break labelTest; //这个break会中断所有循环并跳转到labelTest的地方，并且不会再继续执行外层循环。有点像ignore
                System.out.printf("%d", w);
            }
            System.out.printf("%n"); //这里的语句不会被执行
        }
        System.out.printf("%n");
        System.out.println("--------------------continue label------------------------------");

        for (int h = 0; h < 5; h++) {
            labelTest1:
            for (int t = 0; t < 5; t++) {
                for (int w = 0; w < 5; w++) {
                    if (w == 3) continue labelTest1; //这个continue会中断内层循环并跳转到labelTest1的地方，继续执行后面循环。
                    System.out.printf("%d", w);
                }
            }
            System.out.printf("%n");
        }

    }

    private static void compareTwoNums(int a, int target) {
        if (a > target)
            result += 1;
        else if (a < target)
            result -= 1;
        else result = 0;
    }
}
