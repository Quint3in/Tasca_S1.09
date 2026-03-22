package org.example;

public record Person(String name, int age) {
    public void kill(Person victim) {
        System.out.println( victim.name() + " is killed by " + name());
    }
}
