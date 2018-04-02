package com.step.bootcamp;

import java.util.Objects;

public class Length {
  private final double value;
  private final LengthUnit unit;

  public Length(double value, LengthUnit unit) {
    this.value = value;
    this.unit = unit;
  }

  @Override
  public String toString() {
    return "Length{" +
        "value=" + value +
        ", unit=" + unit +
        '}';
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null || getClass() != other.getClass()) return false;
    Length length = (Length) other;
    return Double.compare(length.unit.toCentimetres(length.value), unit.toCentimetres(value)) == 0;
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(this.unit.toCentimetres(this.value));
  }
}
