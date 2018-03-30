package com.step.bootcamp;

public class Feet extends Length{
  private double value;

  public Feet(double value) {
    this.value = value;
  }

  @Override
  double getInchesValue() {
    return value * 12;
  }
}
