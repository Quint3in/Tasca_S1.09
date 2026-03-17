package org.example;

public class Main {
    enum Day {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }

    public static void main(String[] args) {
        Day d = Day.Monday;
        printDayType(d);
    }

    static void printDayType(Day day) {
        if (day == Day.Saturday || day == Day.Sunday) {
            System.out.println("Dia no laborable");
        } else {
            System.out.println("Dia laborable");
        }
    }
}
