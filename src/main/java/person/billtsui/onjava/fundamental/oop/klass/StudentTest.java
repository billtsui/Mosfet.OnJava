/**
 * @author         Bill Tsui
 * @date           Nov 18 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.oop.klass;

public class StudentTest {
    public static void main(String[] args) {
        // Using different constructors
        var student1 = new Student(); // Default constructor
        var student2 = new Student("Alice"); // Name only
        var student3 = new Student("Bob", 20); // Name and age
        var student4 = new Student("Carol", 19, "Computer Science"); // All parameters

        // Display all students
        IO.println("=== Student Information ===");
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();

        //Mofidy objects
        IO.println("\n=== After Changes ===");
        student2.changeMajor("Mathematics");
        student3.changeMajor("Physics");
    }
}
