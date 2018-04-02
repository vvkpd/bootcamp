package com.step.bootcamp;

public enum MassUnit implements Unit{
  KILOGRAM(1000),TON(1000000),GRAM(1);

  private double gramMultiplier;

  MassUnit(double gramMultiplier) {
    this.gramMultiplier = gramMultiplier;
  }

  @Override
  public double toBaseUnit(double value) {
    return gramMultiplier*value;
  }
}
