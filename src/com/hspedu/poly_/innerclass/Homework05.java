package com.hspedu.poly_.innerclass;

public class Homework05 {
    public static void main(String[] args) {
        Cellphone02 cellphone = new Cellphone02();
        cellphone.testWork(new ICalculate02() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 8, 10);

        cellphone.testWork(new ICalculate02() {
            @Override
            public double work(double n1, double n2) {
                return n1 * n2;
            }
        }, 8, 10);
    }
}

interface ICalculate02 {
    public double work(double n1, double n2);
}

class Cellphone02 {
    public void testWork(ICalculate02 iCalculate, double n1, double n2) {
        double result = iCalculate.work(n1, n2);
        System.out.println("结果是" + result);
    }
}

