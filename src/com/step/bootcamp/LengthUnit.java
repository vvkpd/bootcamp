package com.step.bootcamp;

public enum LengthUnit implements Unit{
  FEET(30),INCH(2.5),CENTIMETRES(1),MILLIMETRES(0.1);

  private final double cmMultiplier;

  @Override
  public double toBaseUnit(double value) {
    return this.cmMultiplier * value;
  }

  LengthUnit(double ratio) {
    this.cmMultiplier = ratio;
  }
}
