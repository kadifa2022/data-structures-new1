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
        //EEE - Jan, Feb, Mar etc
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/y  hh:mm a");
        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf));
    }
}
// CHECK DAY 25 IN JAVA
//E - Name of the day