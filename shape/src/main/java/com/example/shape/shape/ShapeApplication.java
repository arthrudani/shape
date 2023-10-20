package com.example.shape.shape;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.shape.Modal.Circle;
import com.example.shape.Modal.Square;
import com.example.shapeInterface.Shape;

@SpringBootApplication
public class ShapeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShapeApplication.class, args);
		
		System.out.println("123");

		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter 1 for circle and 2 for square: ");  
		int a= sc.nextInt(); 
		
		switch(a) {
		  case 1:
			  System.out.print("Enter radius: ");  
			  a= sc.nextInt(); 
			  Shape circle=new Circle(a);
			  circle.draw();
			  System.out.println(circle.size());
			  break;
		  case 2:
			  System.out.print("Enter length: ");  
			  a= sc.nextInt();
			  Shape square=new Square(a);
			  square.draw();
			  System.out.println(square.size());
			  break;
		  default:
			  System.out.println("please enter 1 or 2 only");
		}
		
	     
	    
	}

}
