package ipa;

import java.util.ArrayList;
import java.util.List;

 class Shape {
	 void draw(){}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("drawing circle");
	}
}

public class GenericTest {
	public static void drawShapes(List<? extends Shape> lists) {
		for (Shape s : lists) {
			s.draw();// calling method of Shape class by child class instance
		}
	}

	public static void main(String args[]) {
		List<Shape> lst = new ArrayList<Shape>();
		lst.add(new Circle());
		lst.add(new Shape());
		
		drawShapes(lst);
	}
}