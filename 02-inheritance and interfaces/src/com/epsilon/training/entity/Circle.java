package com.epsilon.training.entity;

import java.util.logging.Level;
import java.util.logging.Logger;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Circle extends Shape{
	
	
	private double radius;
	Logger logger= Logger.getLogger(Circle.class.getName());
	public Circle(double radius) {
		this.radius=radius;
	}
	@Override
	public void printArea() {
		// TODO Auto-generated method stub
	double area= PI*radius*radius;
	logger.log(Level.INFO, "Area=" + area);
		
	}
	
}
