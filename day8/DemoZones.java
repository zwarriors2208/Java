package day8;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class DemoZones {
    public static void main(String[] args) {
        Set<String> zoneids = ZoneId.getAvailableZoneIds();
        System.out.println(zoneids);

        //Asia/Clacutta
        //America/Los_Angeles
        LocalDateTime indialocal= LocalDateTime.now();
        System.out.println(indialocal);

        ZonedDateTime ist=indialocal.atZone(ZoneId.systemDefault());
        System.out.println(ist);

        //Convert out time into other zone time

        Instant instant=ist.toInstant();
        ZonedDateTime la=instant.atZone(ZoneId.of("America/Los_Angeles"));
        System.out.println(la);
        System.out.println("Local time at LA: "+la.toLocalDateTime());

    }
}