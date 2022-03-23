package com.company;

public class Main {
    public static void main(String[] args) {


        Person P1 = new Person();
        P1.setAge(10);
        P1.setFirstName("Tom");
        P1.setSecondName("EL");
        P1.setDegree("telekom");
        P1.setStudent(true);
        System.out.println(P1);
        Person P2 = new Person();
        P2.setAge(10);
        P2.setFirstName("Tom");
        P2.setSecondName("EL");
        P2.setDegree("telekom");
        P2.setStudent(false);
        System.out.println(P2.equals(P1));
        System.out.println(P1.hashCode());
        System.out.println(P2.hashCode());
        // alt +insert makes a big difference


    }
}
