/**--------------------------------------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Oct 22 2025 10:58
 * {@code @Description:}
 * --------------------------------------------------------------------------------------------------------
 *   Types     length         min value                    max value                        wrapper class
 *  boolean       -              -                          -                                  Boolean
 *  byte       8  bits        -128         (-2^7)           +127        (2^7-1)                 Byte
 *  short      16 bits        -32768       (-2^15)          +32767      (2^15-1)                Short
 *  int        32 bits        −2147483648  (-2^31)          +2147483647 (2^31-1)                Integer
 *  long       64 bits        −9223372036854775808(-2^63)   +9223372036854775807(2^63-1)        Long
 *  float      32 bits        IEEE754  Sign 1 bit Exponent 8  bits  Mantissa 23 bits            Float
 *  double     64 bits        IEEE754  Sign 1 bit Exponent 11 bits  Mantissa 52 bits            Double
 *  char       16 bits        Unicode 0 \u0000              +65535(2^16-1)                      Character
 * --------------------------------------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.datatypes;

import java.math.BigDecimal;
import java.math.BigInteger;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);
        System.out.println("The min value of Character: "+ (int)Character.MIN_VALUE);
        System.out.println("The max value of Character: " + (int)Character.MAX_VALUE);
        System.out.println("The min value of Byte: " + Byte.MIN_VALUE);
        System.out.println("The max value of Byte: " + Byte.MAX_VALUE);
        System.out.println("The min value of Short: " + Short.MIN_VALUE);
        System.out.println("The max value of Short: " + Short.MAX_VALUE);
        System.out.println("The min value of Integer: " + Integer.MIN_VALUE);
        System.out.println("The max value of Integer: " + Integer.MAX_VALUE);
        System.out.println("The min value of Long: " + Long.MIN_VALUE);
        System.out.println("The max value of Long: " + Long.MAX_VALUE);

        //---------------------print bit mode of float----------------------
        // Exponent是移码表示，要减去127
        float floatValue = 0.0f;
        float floatValue2 = -0.0f;
        float floatValue3 = 1.5f;
        float floatValue4 = -1.5f;

        printFloatBitMode(floatValue);
        printFloatBitMode(floatValue2);
        printFloatBitMode(floatValue3);
        printFloatBitMode(floatValue4);

        //---------------------print bit mode of double----------------------
        //指数位移码表示，要减去1023
        double doubleValue = 0.0d;
        double doubleValue2 = -0.0d;
        double doubleValue3 = 1.5d;
        double doubleValue4 = -1.5d;

        printDoubleBitMode(doubleValue);
        printDoubleBitMode(doubleValue2);
        printDoubleBitMode(doubleValue3);
        printDoubleBitMode(doubleValue4);

        {
            //在作用域外不能使用变量x
            int x = 10;
        }

        //BigDecimal
        BigDecimal bigDecimal = new BigDecimal("3.22222222222222222222222222222222111111111111111111111111111111111111111111111");
        BigDecimal bigDecimal1 = new BigDecimal("2.22222222222222222222222222222222");
        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));

        //BigInteger
        BigInteger bigInteger = new BigInteger("1000000000000000");
        BigInteger bigInteger1 = new BigInteger("9999999999999999999");
        System.out.println(bigInteger.add(bigInteger1));
    }

    private static void printFloatBitMode(float floatValue) {
        // 1. 使用 floatToRawIntBits 获取 IEEE 754 32位表示的 int 值
        int rawIntBits = Float.floatToRawIntBits(floatValue);

        // 2. 将 int 值转换为 32 位的二进制字符串
        // Integer.toBinaryString 默认不会填充前导零，所以需要手动处理。
        String binaryString = Integer.toBinaryString(rawIntBits);

        // 3. 填充前导零至 32 位
        String formattedBits = String.format("%32s", binaryString).replace(' ', '0');

        System.out.println("Float: " + floatValue +
                "\t-> Raw Int: " + rawIntBits +
                "\t-> Binary (IEEE 754): " + formattedBits);

        // 可选：添加格式化，显示符号位、指数位和尾数位
        System.out.println("   (Sign: " + formattedBits.charAt(0) +
                " | Exponent: " + formattedBits.substring(1, 9) +
                " | Mantissa: " + formattedBits.substring(9) + ")\n");
    }

    private static void printDoubleBitMode(double doubleValue) {
        // 1. 使用 floatToRawIntBits 获取 IEEE 754 32位表示的 int 值
        long rawIntBits = Double.doubleToRawLongBits(doubleValue);

        // 2. 将 int 值转换为 64 位的二进制字符串
        // Integer.toBinaryString 默认不会填充前导零，所以需要手动处理。
        String binaryString = Long.toBinaryString(rawIntBits);
        // 3. 填充前导零至 64 位
        String formattedBits = String.format("%64s", binaryString).replace(' ', '0');

        System.out.println("Float: " + doubleValue +
                "\t-> Raw Int: " + rawIntBits +
                "\t-> Binary (IEEE 754): " + formattedBits);

        // 可选：添加格式化，显示符号位、指数位和尾数位
        System.out.println("   (Sign: " + formattedBits.charAt(0) +
                " | Exponent: " + formattedBits.substring(1, 12) +
                " | Mantissa: " + formattedBits.substring(12) + ")\n");
    }
}
