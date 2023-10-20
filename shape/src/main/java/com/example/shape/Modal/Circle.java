package com.example.shape.Modal;

import com.example.shapeInterface.Shape;

public class Circle implements Shape{
	private double radius;

	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double size() {
		return 3.14*radius*radius;
	}

	public void draw() {
		System.out.println("Drawing circle");
	}
}
