package org.example;

public class Main {
    public static void main(String[] args) {
        Day d = Day.Monday;
        printDayType(d);

        Task t1 = new Task(Level.MEDIUM);
        t1.showBehavior();
    }

    static void printDayType(Day day) {
        if (day == Day.Saturday || day == Day.Sunday) {
            System.out.println("Dia no laborable");
        } else {
            System.out.println("Dia laborable");
        }
    }
}
