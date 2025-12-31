package com;
class Engine {
	static int s1 = 10;
	public void start() {
		s1 = 20;
		System.out.println("car started "+s1);
	}
}

class Car {
    private Engine engine;  // HAS-A relationship

    Car() {
        engine = new Engine(); // Car creates Engine
    }

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}

// Main class
public class CompositionExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
