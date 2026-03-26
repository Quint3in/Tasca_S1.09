package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Schedule {
    private List<LocalDateTime> dates = new ArrayList<>();

    public Schedule() {
        dates.add(LocalDateTime.now().minusDays(2));
        dates.add(LocalDateTime.now().plusHours(3));
        dates.add(LocalDateTime.now().plusDays(1));
        dates.add(LocalDateTime.now().plusDays(7).withHour(9).withMinute(30));
        dates.add(LocalDateTime.now().minusHours(5));
    }


    public void printUpcomingAppointments(DateTimeFormatter formatter) {
        LocalDateTime now = LocalDateTime.now();
        dates.stream()
                .filter(dateTime -> !dateTime.isBefore(now))
                .sorted(Comparator.naturalOrder())
                .forEach(dateTime -> System.out.println(dateTime.format(formatter)));
    }
}
