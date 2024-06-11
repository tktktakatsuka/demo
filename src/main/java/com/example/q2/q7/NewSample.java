package com.example.q2.q7;

import java.util.function.Predicate;

import com.example.q2.q7.Person.Gender;

public class NewSample {
    public static void main(String[] args) {

        Predicate<Person> isMale = p -> p.getGender().equals(Gender.MALE);
        Predicate<Person> isFeMale = p -> p.getGender().equals(Gender.FEMALE);
        Predicate<Person> isAdult = p -> p.getAge() >= 20;

        Person sample = new Person(Gender.MALE, 20);
        if (isMale.or(isFeMale).and(isAdult).test(sample)) {
            System.out.println("ok");
        } else {
            System.err.println("error");
        }

    }

}
