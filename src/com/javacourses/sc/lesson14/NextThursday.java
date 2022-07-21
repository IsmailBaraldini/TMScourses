package com.javacourses.sc.lesson14;

import java.time.LocalDate;
import java.time.Month;

public class NextThursday
{
    public static void main(String[] args)
    {

        LocalDate date = LocalDate.of(2022, Month.JULY, 19);
        LocalDate nextThur = date.plusWeeks(1);
        System.out.printf("For the date of %s, the next Thursday is %s.%n",
                date, nextThur);
    }
}
