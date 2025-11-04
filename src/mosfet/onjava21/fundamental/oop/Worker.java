/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 04 2025 13:48
 * {@code @Description:}
 * --------------------------------------------------------------------------
 * 子类不能继承父类的构造方法和私有成员。虽然私有变量在内存结构中继承了，但是不能直接访问私有变量
 * 子类会调用父类的无参构造函数，因为需要初始化从父类中继承的成员变量
 */
package mosfet.onjava21.fundamental.oop;

public class Worker extends NewPerson {
    private int salary;

    public Worker() {
        System.out.println("Worker() constructor");
    }

    public Worker(String name, short age, int salary) {
        super(name, age);
        setSalary(salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    /**
     * JDK 1.5 后 override 可以返回父类的子类
     * 访问修饰符只能范围相同或者变大，不能缩小
     * 不能抛出更大的异常 即如果父类方法抛出的是IOException，则子类不能抛出Exception
     * 子类方法抛出的异常范围只能相同或者更小，类似于一棵树，只能抛出父节点和子结点。
     *
     * @param name
     * @return
     */
    @Override
    public Worker returnParent(String name) {
        return new Worker();
    }
}
