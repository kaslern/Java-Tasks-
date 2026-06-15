package com.example.Tasks07;

public enum Month {
    JANUARY(31, false),
    FEBRUARY(28, false),
    MARCH(31, false),
    APRIL(30, false),
    MAY(31, false),
    JUNE(30, true),
    JULY(31, true),
    AUGUST(30, true),
    SEPTEMBER(31, false),
    OCTOBER(30, false),
    NOVEMBER(31, false),
    DECEMBER(31, false);

    private final int days;
    private final boolean isHolidaySeason;


    Month(int days, boolean isHolidaySeason) {
        this.days = days;
        this.isHolidaySeason = isHolidaySeason;
    }

    public int getDays() {
        return days;
    }

    public boolean isHolidaySeason() {
        return isHolidaySeason;
    }

    //Task7
    @Override
    public String toString() {
        return this.name() + " " + "(" + "days: " + days + ")" +
                " Holiday month: " + isHolidaySeason();
    }

}
