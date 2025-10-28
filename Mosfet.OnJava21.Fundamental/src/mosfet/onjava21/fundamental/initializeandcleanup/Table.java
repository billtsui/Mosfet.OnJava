/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Oct 28 2025 14:42
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.initializeandcleanup;

public class Table {
    static Bowl bowl = new Bowl(1);

    Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }

    void f2(int maker) {
        System.out.println("f2(" + maker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}
