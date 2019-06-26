/*  3. Write a java program to calculate first and last date of a week.
Output:
First Date of Week: Mon 24/07/2017
Last date of the week: Sun 30/07/2017   */

package com.stackroute.pe3;

import java.util.*;
import java.text.*;

public class DateAndTime {
    public static void main(String args[])
    {
        DateAndTime.CalculateFirstLastDateTime();
    }

    public static void CalculateFirstLastDateTime()
    {
        // Get calendar set to current date and time
        Calendar c = Calendar.getInstance();

        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        System.out.println();
        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(df.format(c.getTime()));
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        System.out.println(df.format(c.getTime()));
        System.out.println();
    }
}
