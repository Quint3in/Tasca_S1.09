package org.example;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt1 = LocalDateTime.now();


        System.out.println(ld.toString());
        System.out.println(lt.toString());
        System.out.println(ldt1.toString());

        LocalDateTime ldt2 = ldt1.plusDays(5).plusHours(10);

        Period period1 = Period.between(ldt1.toLocalDate(), ldt2.toLocalDate());
        Duration duration1 = Duration.between(ldt1, ldt2);
        System.out.println("---------------------------------");
        System.out.println("Diferencia en dias y horas");
        System.out.println(period1.getDays());
        System.out.println(duration1.toHours());

        ldt2 = ldt2.plusYears(5).plusMonths(1).minusYears(10).minusHours(20);
        System.out.println("---------------------------------");
        System.out.println("Restar/Sumar a la fecha");
        System.out.println(ldt2.toString());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy");
        System.out.println("---------------------------------");
        System.out.println("Fecha con distintos formatos");
        System.out.println(ldt2.format(formatter));
        System.out.println(ldt2.format(formatter2));
        System.out.println(ldt2.format(formatter3));

        System.out.println("---------------------------------");
        System.out.println("Fecha anterior a hoy");
        System.out.println(ldt2.toString() + " - " + isPastDate(ldt2));
    }
    private static boolean isPastDate(LocalDateTime d) {
        return d.isBefore(LocalDateTime.now());
    }
}
