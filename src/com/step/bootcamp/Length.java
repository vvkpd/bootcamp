package com.step.bootcamp;

import java.util.Objects;

public class Length {
  private final double value;
  private final LengthUnit unit;

  private Length(double value, LengthUnit unit) {
    this.value = value;
    this.unit = unit;
  }

  public static Length inFeet(double value){
    return new Length(value, LengthUnit.FEET);
  }
  public static Length inInches(double value){
    return new Length(value, LengthUnit.INCH);
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
    return Double.compare(length.unit.toInches(length.value), unit.toInches(value)) == 0;
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(this.value);
  }
}
