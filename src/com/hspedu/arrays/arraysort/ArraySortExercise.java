package com.hspedu.arrays.arraysort;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortExercise {
    public static void main(String[] args) {

        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 20);
        books[1] = new Book("动物世界", 10);
        books[2] = new Book("Java从入门到入土", 50);
        books[3] = new Book("新版新华字典", 49);

        /*
         * 按照书本价格从低到高排序
         * */

        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book booko1 = (Book) o1;
                Book booko2 = (Book) o2;
                double priceDiff = booko1.getPrice() - booko2.getPrice();
                if (priceDiff > 0) {
                    return 1;
                } else if (priceDiff < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));

        /*
         * 按照书本价格从高到低排序
         * */

//        Arrays.sort(books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Book booko1 = (Book) o1;
//                Book booko2 = (Book) o2;
//                double priceDiff = booko1.getPrice() - booko2.getPrice();
//                if (priceDiff > 0) {
//                    return -1;
//                } else if (priceDiff < 0) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//        });
//        System.out.println(Arrays.toString(books));

        /*
         * 按照书名长度从长到短排序
         * */

//        Arrays.sort(books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Book booko1 = (Book) o1;
//                Book booko2 = (Book) o2;
//                return booko2.getName().length() - booko1.getName().length();
//            }
//        });
//        System.out.println(Arrays.toString(books));

    }
}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}