/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Oct 29 2025 10:44
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package mosfet.onjava21.fundamental.string;

public class BufferAndBuilder {
    //线程安全的
    StringBuffer buffer = new StringBuffer();

    //非线程安全的
    StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {
        BufferAndBuilder bufferAndBuilder = new BufferAndBuilder();
        //打印对象的内存地址
        System.out.println(Integer.toBinaryString(bufferAndBuilder.hashCode()));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
