package com.company;

import java.util.Objects;

public class Person {
    private String firstName;
    private String secondName;
    private int age;
    private String degree;
    private Boolean student;

    public Person(String firstName, String secondName, int age, String degree, boolean student) {
        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;
        this.degree = degree;
        this.student = student;
    }

    public Person(int age) {
        this.age = age;
    }


    public void setStudent(Boolean student) {
        this.student = student;
    }

    public String getFirstName() {
        return firstName;
    }


    public int getAge() {
        return age;
    }

    public String getDegree() {
        return degree;
    }

    public String getSecondName() {
        return secondName;
    }

    public Boolean getStudent() {
        return student;
    }

    @Override
    public String toString() {
        return firstName + ' ' + secondName + ' ' + age + ' ' + degree + ' ' + student;
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (o == this) {
            result = true;
        } else {
            final Person other = (Person) o;
            if ((this.firstName == null) ? (other.firstName == null) : this.firstName.equals(other.firstName)) {
                if (this.age == other.age) {
                    result = true;
                }
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, age, degree, student);
    }
    /** -zaczac od tego znaku i tools generate
     *
     *
     *
     */
}



