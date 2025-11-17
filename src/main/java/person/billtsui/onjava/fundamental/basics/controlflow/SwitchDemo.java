/**
 * @author         Bill Tsui
 * @date           Nov 17 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.basics.controlflow;

import java.util.ArrayList;
import java.util.List;

public class SwitchDemo {
    public static void main(String[] args) {
        int month = 8;
        List<String> futureMonths = new ArrayList<>();

        switch (month) {
            case 1: futureMonths.add("January");
            case 2: futureMonths.add("February");
            case 3: futureMonths.add("March");
            case 4: futureMonths.add("April");
            case 5: futureMonths.add("May");
            case 6: futureMonths.add("June");
            case 7: futureMonths.add("July");
            case 8: futureMonths.add("August");
            case 9: futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                break;
            default:
                break;
        }
        IO.println(futureMonths);
    }

    public int calculateDaysInMonth(int year, int month){
        int days = 0;

        switch(month){
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 4, 6, 9, 11 -> days = 30;
            case 2 ->  {
                if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
                    days = 29;
                } else {
                    days = 28;
                }
            }
            default -> IO.println("Invalid month: " + month);
        }
        return days;
    }
}
