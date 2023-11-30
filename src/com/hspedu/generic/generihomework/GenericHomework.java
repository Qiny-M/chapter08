package com.hspedu.generic.generihomework;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericHomework {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("jack", 11, new MyDate(1999, 1, 1)));
        employees.add(new Employee("jim", 24, new MyDate(1980, 4, 22)));
        employees.add(new Employee("smith", 21, new MyDate(2001, 6, 15)));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!(o1 != null && o2 != null)) {
                    return 0;
                }
                int i = o1.getName().compareTo(o2.getName());
                if (i!=0){
                    return i;
                }
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });

        System.out.println(employees);
    }
}
