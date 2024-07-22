package org.example;

// Prototype Interface
interface Shape {
    Shape clone();
    void draw();
}

// Concrete Prototype: Circle
class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Shape clone() {
        return new Circle(this.radius); // Cloning the current object
    }

    public void draw() {
        System.out.println("Drawing Circle with radius " + radius);
    }
}

// Client code
public class PrototypeExample {
    public static void main(String[] args) {
        Circle circle = new Circle(30); // Creating a new Circle object

        Circle clonedCircle = (Circle) circle.clone(); // Cloning the circle

        circle.draw(); // Drawing original circle
        clonedCircle.draw(); // Drawing cloned circle
    }
}

