package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nPrimera Instancia");
        Person p1 = new Person("John", 25);
        System.out.println(p1.name());
        System.out.println(p1.age());

        System.out.println("\nMétodo Personalizado");
        Person p2 = new Person("Marcus", 23);
        p2.kill(p1);

        System.out.println("\nValidación Constructor");
        try {
            Person p3 = new Person("James", -1);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: "+e.getMessage());
        }
        try {
            Person p4 = new Person("", 23);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: "+e.getMessage());
        }

        System.out.println("\nLambdas");
        List<Person> personList = new ArrayList<>(
                List.of(
                        p1,
                        p2,
                        new Person("Ethan", 16),
                        new Person("Mateo", 15)
                )
        );

        personList.stream()
                .filter( person -> person.age()>=18)
                .forEach(System.out::println);
    }
}
