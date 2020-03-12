package com.epsilon.training.entity;

import java.util.logging.Logger;

public abstract class Shape {
	Logger logger = Logger.getLogger(Shape.class.getName());
	protected static final double PI ;
 static {     // due to final keyword above value of PI can be assigned only once and cannot be thus put into a constructor
	PI=3.1416;
}
	// subclasses cannot override final methods
	public void info() {
		logger.info("Classname: Shape");
		logger.info("Created by: Subhadeep <subhadeep.ganguly@epsilon.com>");
	}
// subclasses has to override abstract methods
	public abstract void printArea();
}
   

// abastract and final does not go hand in hand as final discourages inheritance and abstract encourages
//inheritance so we can't make a method with both abstract nad final keywords