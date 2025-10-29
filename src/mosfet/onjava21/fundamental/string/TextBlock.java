/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Oct 29 2025 11:32
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.string;

/**
 * JDK 15 特性 text block
 */
public class TextBlock {
    public static void main(String[] args) {
        String text = """
                这是一个可以
                换行的
                字符串
                """;

        System.out.println(text);

        String indent4 = """
                  如何控制缩进呢？
                  很简单。
                  改变\"""的位置
                """; //缩进2个位置
        System.out.println(indent4);

        String indent8 = """
                        如何控制缩进呢？
                        很简单。
                        改变\"""的位置
                """; //缩进8个位置
        System.out.println(indent8);

        //JDK 15 新特性 formatted
        String textSample = """
                %d
                %.2f
                %08d
                """.formatted(10, 3.14159f, 6);
        System.out.println(textSample);
    }
}
