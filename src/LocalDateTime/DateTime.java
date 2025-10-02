package LocalDateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTime {

    public static void main(String[] args) {

        ZonedDateTime nextFriday= LocalDateTime.now().plusHours(1)
                .with(TemporalAdjusters.next(DayOfWeek.FRIDAY)).atZone(ZoneId.of("Asia/Kolkata"));
        System.out.println(nextFriday);

        ZonedDateTime now=ZonedDateTime.now();
        System.out.println(now);


        LocalDate birthday=LocalDate.of(1999,Month.MARCH,1);
        System.out.println(birthday);

        Month month=LocalDateTime.now().getMonth();
        System.out.println(month);

        LocalDateTime fiveHoursBefore=LocalDateTime.now().minusHours(5);
        System.out.println(fiveHoursBefore);

        LocalDateTime currentTime=LocalDateTime.now();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate=currentTime.format(formatter);
        LocalDate parsedDate=LocalDate.parse(formattedDate,formatter);
        System.out.println(parsedDate);

    }
}
