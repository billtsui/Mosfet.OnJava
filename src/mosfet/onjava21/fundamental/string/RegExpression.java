/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Oct 29 2025 13:24
 * {@code @Description:}
 * --------------------------------------------------------------------------
 * 在Java中，单个\具有特殊含义，用来引入转义序列。例如\n表示换行，\t表示制表符
 * 所以如果要表示一个字面上的\，需要使用\\来表示
 * 正则表达式中表示数字用\d，在Java中就需要用\\d
 * 如果要匹配一个字面上的\，正则是\\，Java中就需要\\\\，前面两个\\表示一个\，后面两个\\表示一个\
 * 如果要匹配一个字面上的.，正则是\.，Java中就需要用\\.
 */
package mosfet.onjava21.fundamental.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {
    public static void main(String[] args) {
        //使用正则最方便的方式就是matches(string reg)方法
        System.out.println("-1234".matches("-?\\d+"));

        // | 表示或者 + 在正则表达式中有特殊含义，所以需要使用\转义，就是\\+
        System.out.println("-1234".matches("(-|\\+)?\\d+"));
        System.out.println("+1234".matches("(-|\\+)?\\d+"));

        /*
         * 1、构造Pattern
         * 2、创建Matcher
         * 3、matcher.matches执行匹配
         */
        String reg = "1[3-9]\\d{9}"; //匹配手机号
        Pattern pattern = Pattern.compile(reg, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("13262781865");
        System.out.println("匹配手机号：" + matcher.matches()); //true

        /*
         * 常用字符         描述
         *   ^          否定符
         *   .          匹配任何单个字符
         *  \d          匹配数字
         *  \D          匹配非数字 [^\d]
         *  \w          匹配字母、数字或者下划线
         *  \W          匹配不是字母、数字和下划线的字符
         *  \s          匹配空白字符(空格、制表符、换行符、回车)
         *  \S          匹配非空白字符
         *  [abc]       匹配括号内的任意1个字符，不能是2个
         */

        System.out.println("1 match [^1] = " + "1".matches("[^1]"));
        System.out.println("1 match . = " + "1".matches("."));//true
        System.out.println("a match . = " + "a".matches("."));//true

        System.out.println("5 match \\d = " + "5".matches("\\d"));//true
        System.out.println("123 match \\d+ = " + "123".matches("\\d+"));//+是量词，表示匹配1个或者多个

        System.out.println("_ match \\w = " + "_".matches("\\w"));//true
        System.out.println("a match \\w = " + "a".matches("\\w"));//true

        System.out.println("a match [abc] = " + "a".matches("[abc]"));//true
        System.out.println("ab match [abc] = " + "ab".matches("[abc]"));//false 只能匹配括号内的任意1个字符

        System.out.println("% match \\W = " + "%".matches("\\W"));//\W ^\w

        System.out.println("a match \\D = " + "a".matches("\\D"));//true
        System.out.println("a match [^\\d] = " + "a".matches("[^\\d]"));//true 非数字要加[] []表示一类字符

        /*
         * 量词
         * 用来表示匹配的数量
         *
         *  *           匹配零次或者大于1次
         *  +           匹配一次或者多次
         *  ?           匹配0次或者1次
         * {n}          恰好n次
         * {n,}         至少n次
         * {n,m}        n ～ m次，至少n次，不超过m次
         */

        System.out.println("b match a* = " + "b".matches("a*")); //false
        System.out.println("b match b* = " + "b".matches("b*"));
        System.out.println(" match b* = " + "".matches("b*")); //true 一次都没有

        System.out.println("aaa match a+ = " + "aaa".matches("a+"));//true

        System.out.println("colour match colou?r = " + "colour".matches("colou?r"));

        System.out.println("111 match \\d{3} = " + "111".matches("\\d{3}"));//true
        System.out.println("111 match 1{3,} = " + "111".matches("1{3,}"));//true

    }
}
