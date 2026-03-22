package org.example;

public record Person(String name, int age) {

    public Person {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name no puede ser vacío");
        }
        if (age < 0) {
            throw new IllegalArgumentException("age no puede ser negativo");
        }
    }
    public void kill(Person victim) {
        System.out.println( victim.name() + " is killed by " + name());
    }
}
