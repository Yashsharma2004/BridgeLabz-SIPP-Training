package builtin_functions;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZones {
    public static void main(String[] args) {
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss z");
        System.out.println("GMT: " + gmt.format(f));
        System.out.println("IST: " + ist.format(f));
        System.out.println("PST: " + pst.format(f));
    }
}
