package com.step.bootcamp;

import java.util.Objects;

/*
* Understands chances of occurring of an event*/
public class Probability {
  private double value;

  public Probability(double value) {
    this.value = value;
  }

  public Probability negation() {
    return new Probability(1 - value);
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null || getClass() != other.getClass()) return false;
    Probability that = (Probability) other;
    return Math.round(that.value * 1000) == Math.round(value * 1000);
  }

  @Override
  public String toString() {
    return "Probability{" +
        "value=" + value +
        '}';
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  public Probability and(Probability probability) {
      return new Probability(probability.value * this.value);
  }

  public Probability or(Probability another) {
    return this.negation()
        .and(another.negation())
        .negation();
  }

}
