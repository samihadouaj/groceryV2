package org.iselab.grocery.controller;

public  class Shapes {
    String shape;

    public Shapes(String shape) {
        this.shape = shape;
    }

    public String  getShape() {
		System.out.println("this is a "+ this.shape);
		return this.shape;
	}


}
