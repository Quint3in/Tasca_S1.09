package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Primera Instancia");
        Person p1 = new Person("John", 25);
        System.out.println(p1.name());
        System.out.println(p1.age());

        System.out.println("Método Personalizado");
        Person p2 = new Person("Marcus", 23);
        p2.kill(p1);
    }
}
