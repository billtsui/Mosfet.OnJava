/**
 * @author         Bill Tsui
 * @date           Dec 14 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.oop.inheritance;

public class Cat extends Animal {
    public static void testClassMethod() {
        IO.println("The static method in Cat");
    }
    
    public void testInstanceMethod() {
        IO.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
    }
}
