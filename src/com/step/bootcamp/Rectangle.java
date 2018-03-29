package com.step.bootcamp;


/*
  Understands enclosed shape with 4 corners at right angles
*/
public class Rectangle {
  private final double length;
  private final double breadth;

  public Rectangle(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  public Rectangle(double side) {
    this(side,side);
  }

  public double area() {
    return length * breadth;
  }

  public double perimeter() {
    return 2*(length+breadth);
  }
}
