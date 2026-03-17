package org.example;

public class Task {
    private Level level;

    public Task(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void showBehavior() {
        switch (level) {
            case LOW -> System.out.println("Low Level");
            case MEDIUM -> System.out.println("Mid Level");
            case HIGH -> System.out.println("High Level");
        }
    }
}
