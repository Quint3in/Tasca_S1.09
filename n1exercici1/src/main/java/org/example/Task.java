package org.example;

public class Task {
    private final Level level;
    private final String body;
    private final String title;
    private boolean done;


    public Task(Level level, String body, String title) {
        this.level = level;
        this.done = false;
        this.body = body;
        this.title = title;
    }

    public Level getLevel() {
        return level;
    }

    public void showBehavior() {
        switch (level) {
            case LOW -> System.out.println("Low Level");
            case MEDIUM -> System.out.println("Mid Level");
            case HIGH -> System.out.println("High Level");
        }
    }

    @Override
    public String toString() {
        return "Task{" +
                "level=" + level +
                ", body='" + body + '\'' +
                ", title='" + title + '\'' +
                ", done=" + done +
                '}';
    }

    public void closeTask() {
        done = true;
    }
}
