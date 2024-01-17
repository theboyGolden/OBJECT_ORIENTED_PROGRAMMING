// Create a base class called Shape with the following attributes and methods:
//
// Attributes: color (String) and filled (boolean).
// Methods:
// getColor() method that returns the color of the shape.
// isFilled() method that returns whether the shape is filled or not.
// setColor(String color) method that sets the color of the shape.
// setFilled(boolean_filled) method that sets whether the shape is filled or not.
//
// Create two subclasses, Circle and Rectangle, that inherit from the Shape class.
//
// For the Circle class:
//
// Add a radius attribute.
// Implement a constructor to initialize the color, filled, and radius.
// Implement a method getArea() that calculates and returns the area of the circle.
// Override the toString() method to provide a meaningful string representation of the circle.
//
// For the Rectangle class:
//
// Add width and length attributes.
// Implement a constructor to initialize the color, filled, width, and length.
// Implement a method getArea() that calculates and returns the area of the rectangle.
// Override the toString() method to provide a meaningful string representation of the rectangle.
//
// Create instances of both Circle and Rectangle classes, set their attributes, and display their information using the toString() method.


class Shape {
    String color;
    boolean filled;

    String getColor() {
        return this.color;
    }

    boolean isFilled() {
        return this.filled;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }
}

class Circle extends Shape {
    double radius;

    Circle() {
        this.radius = 0;
        this.color = "New";
        this.filled = false;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    //Math.PI is the java representation of a pi which is approximately 3.142. So therefore the Area becomes pi * radius squared

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + ", filled=" + filled + "]";
    }
}

class Rectangle extends Shape {
    double width;
    double length;

    Rectangle() {
        this.width = 0;
        this.length = 0;
        this.color = "New";
        this.filled = false;
    }

    double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", length=" + length + ", color=" + color + ", filled=" + filled + "]";
    }
}
