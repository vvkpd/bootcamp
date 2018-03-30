package com.step.bootcamp;

import java.util.Objects;

public abstract class Length {
  abstract double getInchesValue();

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass().getSuperclass() != o.getClass().getSuperclass()) return false;
    Length length = (Length) o;
    return Double.compare(length.getInchesValue(), this.getInchesValue()) == 0;

  }

  @Override
  public int hashCode() {
    return Objects.hash(this.getInchesValue());
  }
}
