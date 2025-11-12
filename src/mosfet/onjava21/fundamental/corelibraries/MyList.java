/**
 * Project  Name:
 * File     Name:
 * Package  Name:
 * Class    Name:
 * <p>
 * Description:
 *
 * @author Bill Tsui
 * @date Wed 12 2025
 * @version 1.0
 * <p>
 * Copyright (c) 2025 Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License.
 */
package mosfet.onjava21.fundamental.corelibraries;

import java.util.*;

public class MyList {
    public static void main(String[] args) {

        //List可以重复添加元素 默认长度为10，新容量 = 原始容量 * 1.5 非线程安全的
        List myList = new ArrayList();
        myList.add(1);
        myList.add(1);
        System.out.println("ArrayList: " + myList);

        //LinkedList 双向链表实现，内部使用Node类型
        List myList2 = new LinkedList();
        myList2.add('a');
        myList2.add('b');
        myList2.add('c');
        myList2.add('d');
        myList2.add('e');
        System.out.println("LinkedList: " + myList2);
        char first = (char) myList2.getFirst();
        char last = (char) myList2.getLast();
        System.out.println(first);
        System.out.println(last);
        int a = myList2.lastIndexOf('a');

        char originalElement = (char) myList2.set(0, '0');
        System.out.println("original element: " + originalElement);

        boolean isContainChara = myList2.contains('a');//false
        System.out.println(isContainChara);

        //Stack
        Stack myStack = new Stack();
        myStack.push('a');
        myStack.push('b');
        myStack.push('c');
        myStack.push('d');
        myStack.push('e');
        System.out.println("Stack: " + myStack);
        System.out.println("Peek Element: " + myStack.peek());//只看不出
        char pop = (char) myStack.pop();//弹出最上面的元素
        System.out.println("Pop element: " + pop);
        System.out.println("Stack: " + myStack);

        //Vector 线程安全的 新容量 = 原始容量 * 2
        Vector myVector = new Vector();

        //Queue
        Queue myQueue = new ArrayDeque(5);
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        myQueue.offer(5);
        System.out.println("Queue: " + myQueue);
        int peek = (int) myQueue.peek();
        System.out.println("Peek element: " + peek);

        int poll = (int) myQueue.poll();
        System.out.println("Poll element: " + poll);
        System.out.println(myQueue);
    }
}
