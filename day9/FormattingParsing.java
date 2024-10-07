package day9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingParsing {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2024,12,12,16,23,40);
        System.out.println(dt);

        String date = dt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a")); //here a means AM/PM
        System.out.println(date);

        date = dt.format(DateTimeFormatter.ofPattern("E-MM-yy HH:mm:ss"));
        System.out.println(date);

//        String mydate="2024/12/12 04:23:40";
        String mydate="12/12/2024 04:23:40";

        LocalDateTime mydt=LocalDateTime.parse(mydate,DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println(mydt);
    }
}
