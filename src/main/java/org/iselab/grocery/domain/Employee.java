package org.iselab.grocery.domain;

public class Employee extends Person{

    double calculateSalary() {
        System.out.println("We are calculating your salary... if it exits :p: ");
        double salary = 74*0.54+7643;
        return  salary;
    }

    @Override
    String areYouHuman() {
        return  "hahah of course not, you are an employee";
    }

//
//   public String dublicated(String yes){
//        System.out.println("YESSS");
//        return  yes+" YYYYEEEESSSS";
//    }
}
