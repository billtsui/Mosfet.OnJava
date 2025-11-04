/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 01 2025 21:09
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.oop;

public class JieCheng {

    public static void main(String[] args) {
        JieCheng jc = new JieCheng();
        System.out.println(jc.jieCheng(6));
        System.out.println(jc.jieCheng2(6));
    }

    public int jieCheng(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    /*
     * 递归计算阶乘
     * 使用递归要有退出条件，首先写退出条件。
     */
    public int jieCheng2(int n) {
        int sum = 1;
        if (n == 1) {
            return sum;
        } else {
            sum = n * jieCheng2(n - 1);
        }
        return sum;
    }


}
