package com.company;

public class Main {
    public static void main(String[] args) {


        Person P1 = new Person("El", "Plan", 20,"tele",true);
        System.out.println(P1.getAge());
        System.out.println(P1.getFirstName());
        System.out.println(P1.getSecondName());
        System.out.println(P1.getStudent());
        System.out.println(P1.getDegree());
        System.out.println(P1);
        Person P2 = new Person("El", "Plan", 20,"tele",true);
        System.out.println(P2.equals(P1));
        System.out.println(P1.hashCode());
        System.out.println(P2.hashCode());
        // alt +insert makes a big difference

    }
}
