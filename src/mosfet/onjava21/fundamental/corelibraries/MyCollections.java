/**
 * Project  Name:
 * File     Name:
 * Package  Name:
 * Class    Name:
 * <p>
 * Description:
 *
 * @author Bill Tsui
 * @date Mon 10 2025
 * @version 1.0
 * <p>
 * Copyright (c) 2025 Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License.
 */
package mosfet.onjava21.fundamental.corelibraries;

import mosfet.onjava21.fundamental.oop.Person;

import java.util.*;

public class MyCollections {
    public static void main(String[] args) {
        // Collection可以添加任何类型的元素
        Collection myCollection = new ArrayList();
        myCollection.add(1);
        myCollection.add("2");
        myCollection.add("A");
        myCollection.add(3.1415);
        System.out.println("myCollection: " + myCollection);
        myCollection.add(new Person("Bill"));
        myCollection.remove("2");
        myCollection.addAll(List.of("a", "b", 4, 3.1415926));
        System.out.println(myCollection.toString());
        System.out.println(myCollection.getClass());
        System.out.println(myCollection.contains("a"));
        System.out.println(myCollection.contains(4));

        Iterator iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println("element: " + o.toString());
            if (o.equals(4)) {
                iterator.remove();
            }
        }
        System.out.println("Remove \"4\": " + myCollection);

        //foreach循环
        for (Object o : myCollection) {
            System.out.print(o.toString() + " ");
        }

        System.out.printf("\n");
        //集合和数组之间的切换
        Object[] array = myCollection.toArray();
        System.out.println("Arrays: " + Arrays.toString(array));

        List<Object> list = Arrays.asList(array);
        System.out.println("List: " + list);

        // 取交集
        myCollection.retainAll(List.of("2"));
        System.out.println(myCollection.toString());
        myCollection.remove("2");


    }
}
