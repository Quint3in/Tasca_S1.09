package org.example;

public class Main {
    static void main() {
        System.out.println("Primera Instancia");
        Person p = new Person("John", 25);
        System.out.println(p.name());
        System.out.println(p.age());


    }
}
