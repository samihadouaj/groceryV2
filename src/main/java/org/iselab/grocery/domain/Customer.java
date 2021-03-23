package org.iselab.grocery.domain;

public class Customer extends Person{
        public String sayMyName(String name){
            System.out.println("THIS MY NAME"+ name);
            return name;
        }

    @Override
    double calculateSalary() {
        System.out.println("We are calculating your salary... if it exits :p: ");
        double salary = 74*0.54+43435;
        return  salary;
    }

    @Override
    String areYouHuman() {
        return "yes of course sir! you are our cutormer";
    }
}
