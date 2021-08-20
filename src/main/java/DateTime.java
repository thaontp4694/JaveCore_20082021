import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DateTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println("----------");

        LocalDate ld = LocalDate.of(2021, 9, 16);
        System.out.println(ld);
        System.out.println("----------");

        System.out.println(today.getDayOfYear());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());
        System.out.println("----------");

        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println("----------");

        System.out.println(today.getYear());
        System.out.println("----------");

        System.out.println(today.plusDays(2));
        System.out.println(today.plusMonths(2));
        System.out.println(today.plusYears(2));
        System.out.println(today.plusWeeks(2));
        System.out.println("----------");

        System.out.println(today.minusDays(2));
        System.out.println(today.minusMonths(2));
        System.out.println(today.minusYears(2));
        System.out.println(today.minusWeeks(2));
        System.out.println("----------");

        System.out.println(today.isBefore(ld));
        System.out.println(today.isAfter(ld));
        System.out.println(today.compareTo(ld));
        System.out.println(today.compareTo(LocalDate.now()));
        System.out.println(today.compareTo(LocalDate.of(2021, 8, 19)));
        System.out.println("----------");

        if (today.isEqual(LocalDate.of(2021, 8, 20))) {
            System.out.println("Equal!!!");
        }
        System.out.println("----------");

        LocalDate eld = LocalDate.ofEpochDay(10);
        System.out.println(eld);
        System.out.println("----------");

        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println("----------");

        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());
        System.out.println("----------");

        LocalDateTime nowLDT = LocalDateTime.now();
        System.out.println(nowLDT);
        System.out.println("----------");

        LocalDateTime ldt = LocalDateTime.of(2021, 9, 16, 17, 30, 0);
        System.out.println(ldt);
        System.out.println("----------");

        System.out.println(today.format((DateTimeFormatter.BASIC_ISO_DATE)));
        System.out.println(today.format((DateTimeFormatter.ISO_DATE)));
        System.out.println("----------");

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(today.format(f));
        System.out.println("----------");

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("d/MMMM/yyyy");
        System.out.println(today.format(f2));
        System.out.println("----------");

        String strD = "20/9/2021";
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/M/yyyy");
        LocalDate pLd = LocalDate.parse(strD, df);
        System.out.println(pLd);
        System.out.println("----------");

        Set<String> zones = ZoneId.getAvailableZoneIds();
        for (String z : zones) {
            System.out.println(z);
        }
        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Etc/GMT+8"));
        System.out.println(zdt);
        System.out.println("----------");

        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2021, 12, 27);
        Period p = Period.between(d1, d2);
        System.out.println(p);
        System.out.println("----------");

        LocalDateTime ldt2 = LocalDateTime.of(2021, 10, 10, 10, 10, 10);
        Duration dr = Duration.between(ldt, ldt2);
        System.out.println(dr);
        System.out.println(dr.toDays());
        System.out.println(dr.toHours());
        System.out.println(dr.toMinutes());
        System.out.println(dr.toSeconds());

    }
}