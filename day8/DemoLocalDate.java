package day8;
import jdk.jshell.execution.LoaderDelegate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.stream.Stream;

public class DemoLocalDate {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println(today);

        LocalDate diwali=LocalDate.of(2025,11,1);
        System.out.println(diwali);

        Period timetodiwali = today.until(diwali);
        System.out.println(timetodiwali);
        System.out.println(timetodiwali.getYears()+"years(s)"+ timetodiwali.getMonths()+"months(s)"+timetodiwali.getDays()+"days(s)");

        long daystodiwali= today.until(diwali, ChronoUnit.DAYS);
        System.out.println(daystodiwali+"days");

        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getMonthValue());
        System.out.println(today.getMonth());
        System.out.println(today.getYear());

        LocalDate tomorrow= today.plusDays(1);
        System.out.println(tomorrow);
        LocalDate nextfriday=today.plus(7, ChronoUnit.DAYS);
        System.out.println(nextfriday);

        System.out.println("----------------------------------");
        Stream<LocalDate> currentyear=LocalDate.of(2024,1,1).datesUntil(LocalDate.of(2025,1,1));

        currentyear.filter((date)->date.getDayOfWeek().equals(DayOfWeek.FRIDAY)).filter((date)-> date.getDayOfMonth()==13).forEach(System.out::println);

        System.out.println(today.with(TemporalAdjusters.firstDayOfMonth()).getDayOfMonth());
        System.out.println(today.with(TemporalAdjusters.next(DayOfWeek.THURSDAY)));
        System.out.println(today.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY)));

    }

}
