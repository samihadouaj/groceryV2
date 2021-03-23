package org.iselab.grocery.domain;

public class Customer extends Person{
        public String sayMyName(String name){
            System.out.println("THIS MY NAME"+ name);
            return name;
        }
}
