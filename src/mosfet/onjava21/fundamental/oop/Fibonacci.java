/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 01 2025 21:42
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.oop;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        //算45项后递归就很卡了。递归栈申请太多，影响性能
        System.out.println(fib.fibonacci(40));

        //地推方式可以计算很多项
        System.out.println(fib.fibonacci2(100));
    }

    /*
     * 递归计算Fibonacci series
     */
    public long fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public long fibonacci2(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            long num = 0;
            long i = 1;
            long j = 1;
            for (int k = 3; k <= n; k++) {
                num = i + j;
                i = j;
                j = num;
            }
            return num;
        }
    }
}
