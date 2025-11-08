package mosfet.onjava21.fundamental.oop;

import java.beans.JavaBean;
import java.lang.annotation.*;

/**
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 06 2025 17:03
 * {@code @Description:}
 * 什么都没有的注解叫标记注解
 */

/*
 * Retention 声明周期 source  class  runtime
 * source   源码阶段保留，编译后删除  辅助开发的功能
 * class    保留到编译后(class文件中)，运行时删除 默认值
 * runtime  加载到JVM中
 */
@Retention(RetentionPolicy.SOURCE)


/*
 * 表示注解信息可以被javadoc工具提取，不添加的话使用注解的地方不会提取annotation
 */
@Documented


/*
 * 修饰哪些元素
 */
@Target({ElementType.TYPE, ElementType.METHOD})

/*
 * 如果一个类使用了当前的注解，有其他的类继承该类，则注解也被继承
 */
@Inherited

/*
 * 这个元注解可以标记当前注解可以在其target重复使用，但是value的注解属性必须和当前注解一致，scope必须相等或小于
 * 例如Retention必须大于当前的注解
 */
@Repeatable(value = MyAnnotations.class)
public @interface MyAnnotation {
    public String name();

    public String value();//String 类型的成员变量，成员变量以无形参的方法形式表示。

    public int index() default 0; //这样写可以在使用注解的地方不传值
}
