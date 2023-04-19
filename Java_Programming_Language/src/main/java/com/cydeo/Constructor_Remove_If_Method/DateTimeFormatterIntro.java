package com.cydeo.Constructor_Remove_If_Method;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM-dd-yy"); //y-4 digit -//yy -2 digit//M- MM -(MMM-Jan, feb,for full Months name -MMMM) number of month

        LocalDate today  = LocalDate.now();


        System.out.println(today.format(df));


        LocalDate date1 = LocalDate.of(2022, 7,1);
        System.out.println(date1.format(df));

        // H-is for 24 Hours format
        // h- is for 12 hours format
        // a - pm/am

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm");//"H:m" for single  Hours and minutes
        LocalTime time1 = LocalTime.of(7,5);
        System.out.println(time1.format(tf));//07


        //EEEE-DAY
        //EEE - MON, TUES, WED
        //MMM -Jan, Feb, Mar etc
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/y  hh:mm a");
        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf));

        //Task: Use the LocalDateTime, get the date and time in following format
        //Tuesday, 1:00 pm, Nov/24/2020
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");
        LocalDateTime time2 = LocalDateTime.of( 2020,11,24, 13,0);
        System.out.println(time2.format(dtf2));
    }
}
// CHECK DAY 25 IN JAVA
//E - Name of the day