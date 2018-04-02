package com.step.bootcamp;

import java.util.Objects;

public class Measurement<T extends Unit> {
  private final double value;
  private final T unit;

  public Measurement(double value, T unit) {
    this.value = value;
    this.unit = unit;
  }

  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    if (another == null || getClass() != another.getClass()) return false;
    Measurement measurement = (Measurement) another;
    if(measurement.unit.getClass() != unit.getClass()) return false;
    return Double.compare(measurement.unit.toBaseUnit(measurement.value), unit.toBaseUnit(value)) == 0;
  }

  @Override
  public String toString() {
    return "Measurement{" +
        "value=" + value +
        ", unit=" + unit +
        '}';
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit.toBaseUnit(value));
  }
}
