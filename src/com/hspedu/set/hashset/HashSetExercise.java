package com.hspedu.set.hashset;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"all"})
public class HashSetExercise {
    public static void main(String[] args) {

        /*
        * hashCode值与equals是否有关系呢？答案是肯定的，
        * 如果使用equals()方法比较两个对象得到true，那么这两个对象的hashCode必须是相同的。
        * 需要注意的是：这里所指的true是，使用Object类中的equals()方法比较两个对象得到的true。
        *
        * 这也就要求了当继承了Object类的一个类需要重写equals()方法来判断相等逻辑时，
        * 也要同时重写hashCode()方法来返回与equals()判断逻辑一致的hashCode值。
        * String类重写了equals方法，所以当equals判断相等时，必须返回给两个对象相同的hashCode值
        *
        *
        * 因此总结equals()与hashCode的关系是：

        * 1）hashCode相等的两个对象，equals()返回的不一定是true。
        *********************************************
        * 2）equals()返回为true时，hashCode一定相等。***
        * ******************************************/

        Set set = new HashSet();
        Dog tom1 = new Dog("tom");
        Dog tom2 = new Dog("tom");
        System.out.println(tom1.hashCode());
        System.out.println(tom2.hashCode());
        set.add(tom1);
        set.add(tom2);
//        System.out.println("set=" + set);

        String a="jim";
        String jim1 = new String("jiiim");
        String jim2 = new String("jiiim");
        String jim3 = new String("jim");
        set.add(jim1);
        set.add(jim2);
        System.out.println(a.hashCode());
        System.out.println(jim1.hashCode());
        System.out.println(jim2.hashCode());
        System.out.println(jim3.hashCode());
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