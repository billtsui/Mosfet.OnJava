/**
 * @author         Bill Tsui
 * @date Nov 17 2025
 * @version 1.0
 * @description
 *
 * Copyright (c) Bill Tsui. All rights reserved. Licensed under the GPLv3
 * License.
 */
package person.billtsui.onjava.fundamental.basics.controlflow;

public class SwitchExpressionDemo {

    public static void main(String[] args) {
        IO.println(processInput(null));
    }

    static String processInput(String input) {
        return switch (input) {
            // 显式处理 null
            case null ->
                "输入为空，请提供有效值。";

            // 处理其他有效字符串
            case "A" ->
                "处理类型 A";
            case "B" ->
                "处理类型 B";

            // default 块处理所有非 null 且未匹配的值
            default ->
                "未知输入";
        };
    }
}
