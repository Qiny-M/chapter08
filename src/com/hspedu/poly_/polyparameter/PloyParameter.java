package com.hspedu.poly_.polyparameter;

public class PloyParameter {
    public static void main(String[] args) {
        Worker jack = new Worker("jack", 2000);
        Manager mary = new Manager("mary", 5000, 2000);
        PloyParameter ployParameter = new PloyParameter();
        ployParameter.showEmpAnnual(jack);
        ployParameter.showEmpAnnual(mary);
        ployParameter.testWork(jack);
        ployParameter.testWork(mary);
    }

    public void showEmpAnnual(Employee e){

        System.out.println(e.getAnnual());
    }
    
    public void testWork(Employee e){
        if(e instanceof Worker){
            ((Worker) e).work();
        }else if(e instanceof Manager){
            ((Manager) e).manage();
        }else{
            System.out.println("无动作。。。");
        }
    }
}
