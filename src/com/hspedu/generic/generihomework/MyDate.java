package com.hspedu.generic.generihomework;

public class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    @Override
    public String toString() {
        return "MyDate{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public int compareTo(MyDate o) {
        int yearMinus = this.getYear() - o.getYear();
        if (yearMinus != 0) {
            return yearMinus;
        }

        int monthMinus = this.getMonth() - o.getMonth();
        if (monthMinus != 0) {
            return monthMinus;
        }

        return this.getDay() - o.getDay();

    }
}
