package day9_asnmt;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.stream.Stream;

public class Age {
    public static void main(String[] args) {
        LocalDate birthdate=LocalDate.of(2003,7,10);
        Period period = Period.between(birthdate, LocalDate.now());
        System.out.println(period.getYears()+" years "+period.getMonths()+" months "+period.getDays()+" days ");

        int year=2025;
        LocalDate today=LocalDate.now();
//        int day = 13;
//        if((year % 100 == 0 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) )
//        {
//            day = 12;
//        }
        LocalDate day = LocalDate.of(year, 1, 1).plus(255, ChronoUnit.DAYS);

        System.out.println("Programmer's Day  in " + year + " is on: " + day + " Sept ");




        Stream<LocalDate> currentyear=LocalDate.of(2024,1,1).datesUntil(LocalDate.of(2025,1,1));
        System.out.println("months starting on a sunday are:");
        currentyear.filter((date)->date.getDayOfWeek().equals(DayOfWeek.SUNDAY)).filter((date)-> date.getDayOfMonth()==1).forEach(n-> System.out.println(n.getMonth()));

        LocalDateTime leave = LocalDateTime.of(2024, 7, 7, 2, 5, 00);
        ZonedDateTime ist = leave.atZone(ZoneId.systemDefault());
        Instant instant = ist.toInstant();
        ZonedDateTime zone = instant.atZone(ZoneId.of("America/New_York"));
        leave = zone.toLocalDateTime();
        LocalDateTime arrive = LocalDateTime.of(2024, 7, 7, 4, 40, 00);
        long h = ChronoUnit.HOURS.between(leave,arrive);
        long m = ChronoUnit.MINUTES.between(leave,arrive) - h*60;
        System.out.println(h+" Hours and "+ m+" minutes");



    };
}
