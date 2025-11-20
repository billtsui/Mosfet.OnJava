/**
 * @author         Bill Tsui
 * @date           Nov 20 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.oop.klass;

public class OuterClass {
    String outerField = "Outer field";
    static String staticOuterField = "Static outer field";

    //内部类和外部类的实例相同，可以访问外部类的所有成员
    class InnerClass {
        void accessMembers() {
            IO.println(outerField);
            IO.println(staticOuterField);
        }
    }

    // 静态嵌套类，不能直接访问外部类的非静态成员
    static class StaticNestedClass {
        void accessMembers(OuterClass outer) {
            // 编译错误，无法直接访问外部类的非静态成员
            //IO.println(outerField);
            IO.println(outer.outerField);
            IO.println(staticOuterField);
        }
    }

    public static void main(String[] args) {
        IO.println("Inner class:");
        IO.println("------------");
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.accessMembers();

        IO.println("\nStatic nested class:");
        IO.println("----------------------");
        StaticNestedClass staticNestedObject = new StaticNestedClass();
        staticNestedObject.accessMembers(outerObject);

        IO.println("\nTop-level class:");
        IO.println("------------------");

        TopLevelClass topLevelClass = new TopLevelClass();
        topLevelClass.accessMembers(outerObject);
    }
}
