package com.example.Tasks07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Task1
        DayOfWeek day = DayOfWeek.MONDAY;
        DayOfWeek day2 = DayOfWeek.THURSDAY;
        DayOfWeek day3 = DayOfWeek.SATURDAY;

        System.out.println(day);

        //Task2
        for (DayOfWeek days : DayOfWeek.values()) {
            System.out.println(days);
        }

        //Task3
        DayOfWeek variable1 = DayOfWeek.SATURDAY;
        DayOfWeek variable2 = DayOfWeek.SUNDAY;

        System.out.println(variable1 == variable2);

        //Task4
        switch (day) {
            case MONDAY -> System.out.println("Początek tygodnia");
            case TUESDAY -> System.out.println("Początek tygodnia");
            case WEDNESDAY -> System.out.println("Środek tygodnia");
            case THURSDAY -> System.out.println("Środek tygodnia");
            case FRIDAY -> System.out.println("Weekend");
            case SATURDAY -> System.out.println("Weekend");
            case SUNDAY -> System.out.println("Weekend");
        }

        //Task5
        System.out.println(day2.isWeekend());
        System.out.println(day3.isWeekend());

        //Task6, 7
        for (Month months : Month.values()) {
            System.out.println(months + " Days: " + months.getDays());
        }

        //Task8
        for (Month months : Month.values()) {
            System.out.println(months + " Order: " + months.ordinal());
        }

        System.out.println(Month.JANUARY.compareTo(Month.MARCH));
        System.out.println(Month.MARCH.compareTo(Month.JANUARY));
        System.out.println(Month.JANUARY.compareTo(Month.JANUARY));

        //Task9
        for (Month months2 : Month.values()) {
            System.out.println(months2);
        }

        //Task10
        Person person1 = new Person("Łukasz", DayOfWeek.MONDAY);
        Person person2 = new Person("Kuba", DayOfWeek.FRIDAY);

        person1.showDayOff();
        person2.showDayOff();

        //Task11
        Month[] monthsArray = {Month.JANUARY, Month.AUGUST, Month.APRIL};
        int sumOfDays = 0;

        for (Month monthDays : monthsArray) {
            sumOfDays += monthDays.getDays();
        }
        System.out.println(sumOfDays);

        //Task12
        for (Currency currency : Currency.values()) {
            System.out.println(currency + currency.getSymbol());
        }

        //Task13
        System.out.println(Operation.ADD.calculate(5, 10));
        System.out.println(Operation.SUBTRACT.calculate(5, 10));
        System.out.println(Operation.MULTIPLY.calculate(5, 10));
        System.out.println(Operation.DIVIDE.calculate(5, 10));

        //Task14
        System.out.println(OrderStatus.SHIPPED.isActive());
        System.out.println(OrderStatus.CANCELED.isActive());
        System.out.println(OrderStatus.PROCESSING.isActive());

        //Task15
        for (Planet planet : Planet.values()) {
            System.out.println(planet);
        }

        //Task16
        Logger.INSTANCE.log("test");

        //Task17
        System.out.println("Please enter your choice: START, STOP or EXIT");
        MenuOption userChoice = MenuOption.valueOf(input.nextLine());

        switch(userChoice) {

            case START -> System.out.println("Program started");
            case STOP -> System.out.println("Program stopped");
            case EXIT -> System.out.println("Exit program");
        }

        //Task18
        Product[] products = {new Product("Iphone", Category.ELECTRONICS),
        new Product("Nike", Category.CLOTHING),
        new Product("Cola", Category.FOOD)};

        for (Product product : products) {
            System.out.println(product);
        }

        //Task19
        System.out.println(Calculation.ADD.calculate(10,5));
        System.out.println(Calculation.SUBTRACT.calculate(10,5));
        System.out.println(Calculation.MULTIPLY.calculate(10,5));
        System.out.println(Calculation.DIVIDE.calculate(10,5));






    }
}
