package com.step.bootcamp;

public enum LengthUnit {
  FEET(30),INCH(2.5),CENTIMETRES(1),MILLIMETRES(0.1);

  private final double cmMultiplier;

  public double toCentimetres(double value) {
    return this.cmMultiplier * value;
  }

  LengthUnit(double ratio) {
    this.cmMultiplier = ratio;
  }
}
