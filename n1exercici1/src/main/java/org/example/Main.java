package org.example;

public class Main {
    public static void main(String[] args) {
        Day d = Day.Monday;
        printDayType(d);

        Task t1 = new Task(Level.MEDIUM);
        t1.showBehavior();
        System.out.println("Color del nivell: " + t1.getLevel().getColor());


        String sMonday = "moNday";
        try {
            String normalized = capitalize(sMonday);
            if (normalized == null) {
                System.err.println("Valor buit o nul");
            } else {
                Day day = Enum.valueOf(Day.class, normalized);
                System.out.println(day);
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Valor no valid: " + sMonday);
        }
    }

    static void printDayType(Day day) {
        System.out.println(day.isLaborable() ? "Dia laborable" : "Dia no laborable");
    }

    static String capitalize(String value) {
        if (value == null || value.isBlank()) {
            return null;
        }
        String trimmed = value.trim();
        return trimmed.substring(0, 1).toUpperCase() + trimmed.substring(1).toLowerCase();
    }
}
