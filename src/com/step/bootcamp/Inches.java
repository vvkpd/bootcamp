package com.step.bootcamp;

public class Inches extends Length {
  private double value;

  public Inches(double value) {
    this.value = value;
  }

  @Override
  double getInchesValue() {
    return value;
  }
}
