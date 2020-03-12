package com.epsilon.training.programs;

import com.epsilon.training.entity.Shape;
import com.epsilon.training.entity.Triangle;

public class PrintShapeArea {
public static void main(String[] args) {
	
	Shape s1;
//	s1= new Shape();
    s1= new Triangle(12.5,45.6); // upcasting
    s1.info();
   	s1.printArea();
  // 	s1.printTriangleInfo(); // a child class function and cannot be invoked using parent reference
    
    // since we know that s1 refers to an instanceof Triangle,
    // can we assign s1 back to another Triangle reference
    Triangle t1;
    if(s1 instanceof Triangle) {
    t1=(Triangle) s1;  //this is down-casting and it is not implicit
    // it is possible that this type of casting may fail if s1 is not pointing to a Triangle object.
   
	t1.printTriangleInfo();
	System.out.println("s1==t1 is"+(s1==t1));
    }
    }
	
}
