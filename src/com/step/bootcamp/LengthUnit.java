package com.step.bootcamp;

public enum LengthUnit {
  FEET(12),INCH(1);

  private double inchMultiplier;

  public double toInches(double value) {
    return this.inchMultiplier * value;
  }

  LengthUnit(int ratio) {
    this.inchMultiplier = ratio;
  }
}
