package mosfet.onjava21.fundamental.oop;

/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 06 2025 15:46
 * {@code @Description:}
 * --------------------------------------------------------------------------
 * 枚举类型线程安全
 * 枚举类既可以用匿名内部类的方式实现每个对象不同的方法，也可以在类中只实现一次，所有对象共享这个方法
 */
public enum Enumeration implements MyInterface {
    Sunday("星期天", 7) {
        @Override
        public void MyMethod() {
            System.out.println("还可以在枚举类中实现接口");
        }
    },
    Monday("星期一", 1) {
        @Override
        public void MyMethod() {

        }
    },
    Tuesday("星期二", 2) {
        @Override
        public void MyMethod() {

        }
    },
    Wednesday("星期三", 3) {
        @Override
        public void MyMethod() {

        }
    },
    Thursday("星期四", 4) {
        @Override
        public void MyMethod() {

        }
    },
    Friday("星期五", 5) {
        @Override
        public void MyMethod() {

        }
    },
    Saturday("星期六", 6) {
        @Override
        public void MyMethod() {

        }
    };

    private final String name;
    private final int value;

    Enumeration(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
