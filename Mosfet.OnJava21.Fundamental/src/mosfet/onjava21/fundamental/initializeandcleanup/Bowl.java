/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Oct 28 2025 14:41
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.initializeandcleanup;

public class Bowl {
    Bowl(int maker) {
        System.out.println("Bowl(" + maker + ")");
    }

    void f1(int maker) {
        System.out.println("f1(" + maker + ")");
    }
}
