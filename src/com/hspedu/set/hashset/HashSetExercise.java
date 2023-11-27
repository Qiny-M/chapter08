package com.hspedu.set.hashset;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"all"})
public class HashSetExercise {
    public static void main(String[] args) {
        Set set = new HashSet();
//        set.add(new Dog("tom"));
//        set.add(new Dog("jack"));
//        System.out.println("set=" + set);

        set.add(new String("jim"));
        set.add(new String("jim"));
        System.out.println("set=" + set);
    }
}

class Dog {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}