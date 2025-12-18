/**
 * @author         Bill Tsui
 * @date           Nov 20 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.oop.klass;


public class LocalClassDemo {

    static String regularExpression = "[^0-9]";

    public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {
        final int numberLength = 10;

        class PhoneNumber {

            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber) {
                // numberLength = 7;
                String currentNumber = phoneNumber.replaceAll(
                        regularExpression, "");
                if (currentNumber.length() == numberLength) {
                    formattedPhoneNumber = currentNumber;
                } else {
                    formattedPhoneNumber = null;
                }
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }

            public void printOriginalNumbers() {
                IO.println("Original numbers are " + phoneNumber1 +" and " + phoneNumber2);
            }

        }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);
        myNumber1.printOriginalNumbers();
        myNumber2.printOriginalNumbers();
        
        if (myNumber1.getNumber() == null) {
            IO.println("First number is invalid");
        } else {
            IO.println("First number is " + myNumber1.getNumber());
        }
        if (myNumber2.getNumber() == null) {
            IO.println("Second number is invalid");
        } else {
            IO.println("Second number is " + myNumber2.getNumber());
        }
    }

    public static void main(String... args) {
        validatePhoneNumber("123-456-7890", "456-7890");
        
    }
}
