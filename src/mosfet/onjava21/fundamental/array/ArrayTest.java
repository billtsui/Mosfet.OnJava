/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Oct 30 2025 11:35
 * {@code @Description:}
 * --------------------------------------------------------------------------
 * Array不可变长度
 * ArrayList可变长度，底层使用Array
 * 数组保存的是对其他对象的引用
 */
package mosfet.onjava21.fundamental.array;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        intArray[0] = 0;//会直接覆盖下标为0的位置
        System.out.println(Arrays.toString(intArray));

        /*
         * 数组的长度是固定的，如果需要向已经使用的位置插入元素
         * 并且把其他元素向后移动，则需要重新申请一块空间。
         * 如果数组还有剩余空间，则先将元素向后移动，然后再插入新元素
         */

        int[] intArray2 = new int[10];
        for (int i = 0; i < 5; i++) {
            intArray2[i] = i + 1;
        }

        /*
         * 将0插入到0的位置
         * 1、找到最后一个不为0的元素
         * 2、依次向后移动
         * 3、插入新元素
         */
        int capacity = -1;
        for (int i = 0; i < intArray2.length; i++) {
            if (intArray2[i] != 0) {
                capacity = i;
            }
        }
        System.out.println(Arrays.toString(intArray2));
        System.out.println("Capacity: " + (capacity + 1));

        for (int j = capacity; j >= 0; j--) {
            intArray2[j + 1] = intArray2[j];
            if (j == 0) {
                intArray2[j] = 0;
            }
        }
        System.out.println(Arrays.toString(intArray2));



        Car[] cars = new Car[10];

        //数组内部对象默认是null
        for (int i = 0; i < 10; i++) {
            if (cars[i] == null) {
                cars[i] = new Car();
            }
        }


        //批量初始化
        Car[] cars2 = {
                new Car(),
                new Car(),
                new Car(),
        };

        //动态批量初始化。可以在传入参数的地方使用
        System.out.println(Arrays.stream(new Car[]{
                new Car(),
                new Car(),
        }).count());

        System.out.println("cars length: " + cars.length);
        System.out.println("cars2 length: " + cars2.length);

        /*
         * 多维数组
         * 可以看成一个矩阵，矩阵的行是第一个[]中的数字，矩阵的列是第二个[]中的数字
         */
        String[][] multiDimensionalArray = new String[][]{
                {"a", "b", "c"},
                {"d", "e", "f"},
                {"g", "h", "i"},
        };

        System.out.println(Arrays.deepToString(multiDimensionalArray));

        /*
         * 声明不规则数组
         */
        String[][] arrayTest = new String[2][3];

    }
}
