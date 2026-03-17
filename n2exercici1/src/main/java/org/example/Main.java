package org.example;

import java.time.*;

public class Main {
    static void main() {
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt1 = LocalDateTime.now();


        System.out.println(ld.toString());
        System.out.println(lt.toString());
        System.out.println(ldt1.toString());

        LocalDateTime ldt2 = ldt1.plusDays(5).plusHours(10);

        Period period1 = Period.between(ldt1.toLocalDate(), ldt2.toLocalDate());
        Duration duration1 = Duration.between(ldt1, ldt2);
        System.out.println("Diferencia en dias y horas");
        System.out.println(period1.getDays());
        System.out.println(duration1.toHours());
    }
}
