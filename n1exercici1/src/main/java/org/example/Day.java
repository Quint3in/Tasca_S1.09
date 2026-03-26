package org.example;

public enum Day {

    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isLaborable;

    Day(boolean isLaborable) {
        this.isLaborable = isLaborable;
    }

    public boolean getIsLaborable() {
        return isLaborable;
    }

    public static Day parseStringToDay (String str) throws IllegalArgumentException {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Valor buit o nul");
        } else {
            return Enum.valueOf(Day.class, str.toUpperCase());
        }
    }
    public static void printDayType(Day day) {
        System.out.println(day.getIsLaborable() ? "Dia laborable" : "Dia no laborable");
    }
}
