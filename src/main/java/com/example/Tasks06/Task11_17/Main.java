package com.example.Tasks06.Task11_17;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Antek", 30);
        Person person2 = new Person("Kuba", 20);
        Person person3 = new Person("Łukasz");

        //Task11
        person1.introduceYourself();
        person2.introduceYourself();

        //Task12
        person1.introduceYourself("Hello!");
        person2.introduceYourself("Hello!");

        //Task13, 14
        person3.introduceYourself();

        //Task15
        System.out.println("Number of people created: " + Person.numberOfPeople);
        System.out.println("Number of people created: " + person1.numberOfPeople);

        //Task16

        Person[] people = {person1, person2, person3};

        for (Person p : people) {
            if (p.isAdult()) {
                System.out.println(p.name + " is an adult");
            }else {
                System.out.println(p.name + " is not adult");
            }
        }

        //Task17

        System.out.println("Age diffrence is: " + person1.compareAge(person2));

    }
}
