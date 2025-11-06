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
 */
public enum Enumeration {
    Sunday("星期天", 7),
    Monday("星期一", 1),
    Tuesday("星期二", 2),
    Wednesday("星期三", 3),
    Thursday("星期四", 4),
    Friday("星期五", 5),
    Saturday("星期六", 6);

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
