package org.example;

public class Main {
    public static void main(String[] args) {
        Day d = Day.MONDAY;
        Day.printDayType(d);

        Task t1 = new Task(Level.HIGH, "Error en la pantalla principal","Error nº1");
        t1.showBehavior();
        System.out.println("Color del nivell: " + t1.getLevel().getColor());
        t1.closeTask();
        System.out.println(t1);

        String sMonday = "moNday";
        Day day = Day.parseStringToDay(sMonday);
        System.out.println(day);
    }
}
