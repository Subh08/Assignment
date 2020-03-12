package com.epsilon.training.entity;

import java.util.logging.Level;
import java.util.logging.Logger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Triangle extends Shape {
	Logger logger = Logger.getLogger(Triangle.class.getName());
	private double base;
	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		double area = 0.5 * base * height;
		logger.info("Area of the triangle=" + area + "sq units");

	}

	public void printTriangleInfo() {
		logger.log(Level.INFO, "Base=" + base);
		logger.log(Level.INFO, "height=" + height);
		
	}
}
