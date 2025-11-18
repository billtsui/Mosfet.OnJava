/**
 * @author         Bill Tsui
 * @date           Nov 18 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.oop;


public class Student {
    String name;
    int age;
    String major;

    // Default constructor
    public Student() {
        name = "Unknown";
        age = 0;
        major = "Undeclared";
    }

    // Constructor with name only
    public Student(String studentName) {
        name = studentName;
        age = 18; // default age
        major = "Undeclared";
    }

    // Constructor with name and age
    public Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
        major = "Undeclared";
    }

    // Construator with all parameters
    public Student(String studentName, int studentAge, String studentMajor) {
        name = studentName;
        age = studentAge;
        major = studentMajor;
    }

    public void displayInfo() {
        IO.println("Name: " + name + ", Age: " + age + ", Major: " + major);
    }

    public void changeMajor(String newMajor) {
        major = newMajor;
        IO.println(name + " changed major to " + newMajor);
    }
}
