package com.example.Tasks06.Task11_17;

public class Person {
    String name;
    int age;
    static int numberOfPeople;

    // Task 11
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfPeople++;
    }
    // Task 13, 14
    public Person(String name) {
        this(name, 0);
    }

    // Task11
    public void introduceYourself() {
        System.out.println("Name: " + name + " Age: " + age);
    }
    // Task12
    public void introduceYourself(String greeting) {
        System.out.println(greeting + " Name: " + name + " Age: " + age);
    }

    //Task16
    public boolean isAdult() {
        return age >= 18;
    }

    //Task17
    public int compareAge(Person other) {
        return this.age - other.age;
    }
}
