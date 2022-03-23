package com.company;

import java.util.Objects;

public class Person {
    private String firstName;
    private String secondName;
    private int age;
    private String degree;
    private Boolean student;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Boolean getStudent() {
        return student;
    }

    public void setStudent(Boolean student) {
        this.student = student;
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
                if (this.age == other.age && this.secondName == other.secondName && this.degree == other.degree && this.firstName == other.firstName && this.student == other.student) {


                    result = true;


                }

            }}
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



