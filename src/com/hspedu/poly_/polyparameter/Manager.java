package com.hspedu.poly_.polyparameter;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    public void manage(){
        System.out.println(getName()+ "经理正在管理。。。");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
