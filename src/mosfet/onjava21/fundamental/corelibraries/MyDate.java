/**
 * Project  Name:
 * File     Name:
 * Package  Name:
 * Class    Name:
 * <p>
 * Description:
 *
 * @author Bill Tsui
 * @date Sat 08 2025
 * @version 1.0
 * <p>
 * Copyright (c) 2025 Bill Tsui. All rights reserved.
 * Licensed under the GPLv3 License.
 */
package mosfet.onjava21.fundamental.corelibraries;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class MyDate {
    public static void main(String[] args) {

        /*
         * Before Java 8
         */
        Date date = new Date(1000);
        System.out.println(date);
        System.out.println(date.getTime());
        date.setTime(2000);
        System.out.println(date);

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(format.format(date));

       DateFormat df = DateFormat.getDateInstance();
       try {
           Date parse = df.parse("2025-10-10 21:34:06");
           System.out.println(parse);
       }catch (Exception e) {

       }

        System.out.println("------------------------------------");

        /*
         * After Java 8
         */
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfWeek());

        LocalDate localDate1 = LocalDate.of(2026, 2, 14);
        System.out.println(localDate1);

        //计算两个日期间隔多少天
        long totalDays = ChronoUnit.DAYS.between(localDate, localDate1);
        System.out.println(totalDays);

        //高精度时间戳 nanosecond-level
        Instant instant = Instant.now();
        System.out.println("Instant now: " + instant);


        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(formatter.format(localDateTime));
    }
}
