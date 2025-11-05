package mosfet.onjava21.fundamental.oop;

/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 05 2025 18:06
 * {@code @Description:}
 * --------------------------------------------------------------------------
 * 接口是比抽象类还抽象的类
 * 接口不能被实例化，所以没有构造函数，所以所有关于成员的都不允许存在
 * 接口只能有常量
 *
 * 接口弥补了不能继承多个类的问题。一各类可以实现多个接口。
 * 接口多用于定义行为
 */
public interface MyInterface {
    public final String name = "MyInterface";

    /**
     * 只能有抽象方法
     */
    public abstract void MyMethod();


    /**
     * Java 9支持接口有私有方法
     */
    private void testMethod(){
        System.out.println("This is a private method");
    };
}
