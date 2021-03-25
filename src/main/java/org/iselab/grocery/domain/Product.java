package org.iselab.grocery.domain;

import org.iselab.grocery.util.UUIDUtils;

public class Product {

    private int id;

    private String name;

    private int amount;

    public Product() {
        this.id = (int) UUIDUtils.getRandomNumber();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String dublicated(String yes){
        System.out.println("YESSS");
        return  yes+" YYYYEEEESSSS";
    }
    @Override
    public String toString() {
        
        StringBuilder builder = new StringBuilder();
        
        builder.append("{");
        builder.append("id: ").append(id).append(", ");
        builder.append("name: \"").append(name).append("\", ");
        builder.append("amount: ").append(amount);
        builder.append("}");
        
        return builder.toString();
    }
}
