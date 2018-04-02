package com.step.bootcamp;

public enum VolumeUnit implements Unit {
  GALLON(3.78),LITRES(1);

  private final double litreMultiplier;

  @Override
  public double toBaseUnit(double value){
    return litreMultiplier * value;
  }

  VolumeUnit(double litreMultiplier) {
    this.litreMultiplier = litreMultiplier;
  }
}
