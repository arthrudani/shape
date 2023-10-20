package com.example.shape.Modal;

import com.example.shapeInterface.Shape;

public class Square implements Shape{

	private double length;
	
	
	public Square(double length) {
		super();
		this.length = length;
	}

	public double size() {
		return length*length;
	}

	public void draw() {
		System.out.println("Drawing square");
	}

}
