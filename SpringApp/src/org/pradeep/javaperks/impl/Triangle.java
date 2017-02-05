package org.pradeep.javaperks.impl;

import org.pradeep.javaperks.intrfc.Shape;

public class Triangle implements Shape {
	
	int breadth;
	int height;

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void getArea() {
		
		System.out.println("Area of triangle is calculated = " + breadth+"*" + height);

	}

}
