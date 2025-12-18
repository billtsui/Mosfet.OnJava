/**
 * @author         Bill Tsui
 * @date           Nov 22 2025
 * @version        1.0
 * @description 
 * 
 * Copyright (c)  Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License. 
 */

package person.billtsui.onjava.fundamental.oop.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnumDemo {
    
    public static void main(String[] args) {
        DayOfWeek weekStart = DayOfWeek.MONDAY;
        if (weekStart == DayOfWeek.MONDAY) {
            IO.println("The week starts on Monday.");
        }

        DayOfWeek someDay = DayOfWeek.FRIDAY;

        switch (someDay) {
            case MONDAY -> IO.println("The week just started.");
            case TUESDAY,WEDNESDAY,THURSDAY -> IO.println("We are somewhere in the middle of the week.");
            case FRIDAY -> IO.println("The weekend is near.");
            case SATURDAY,SUNDAY -> IO.println("Weekend");
            default -> throw new  AssertionError("Should not happen");
        }

        IO.println(weekStart.name());
        IO.println(weekStart.ordinal());

        DayOfWeek[] days = DayOfWeek.values();
        DayOfWeek monday = DayOfWeek.valueOf("MONDAY");
        IO.println(days.length);
        IO.println(monday.toString());

        List<DayOfWeek> dayList = new ArrayList<>(List.of(DayOfWeek.FRIDAY, DayOfWeek.TUESDAY, DayOfWeek.SUNDAY));
        Collections.sort(dayList);
    }


    public void compareDayOfWeek(DayOfWeek dayOfWeek) {
        int comparison = dayOfWeek.compareTo(DayOfWeek.MONDAY);
        if (comparison < 0) {
            IO.println("It's before the middle of the work week.");
        } else if (comparison > 0) {
            IO.println("It's after the start of the work week.");
        } else {
            IO.println("It's the middle of the work week.");
        }
    }
}
