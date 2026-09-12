package com.example.Tasks07;

public enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    //Task5
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}
