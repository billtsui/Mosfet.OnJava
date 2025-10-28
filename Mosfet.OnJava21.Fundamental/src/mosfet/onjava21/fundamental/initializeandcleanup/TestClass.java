/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Oct 25 2025 16:37
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.initializeandcleanup;

public class TestClass {
    public static void main(String[] args) {
        new Initialize();
        new Initialize("arguments");
        Initialize initialize = new Initialize();
        initialize.m1(5);
        initialize.m1((byte)5);
        initialize.m1((char)5);
    }
}
