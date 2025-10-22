/**
 * --------------------------------------------------------------------------
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Oct 22 2025 10:20
 * {@code @Description:}
 * --------------------------------------------------------------------------
 */
package VarAndDataTypes;

import java.util.Scanner;

public class Var {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myName = scanner.nextLine();
        int myAge = scanner.nextInt();
        System.out.println("My name is " + myName + "my age is " + myAge);
    }
}
