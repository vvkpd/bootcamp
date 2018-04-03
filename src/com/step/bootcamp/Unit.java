package com.step.bootcamp;

import java.util.Objects;

import static com.step.bootcamp.MeasurementType.*;

public enum Unit {
  FEET(12, LENGTH), INCH(1, LENGTH), CENTIMETRES(0.4, LENGTH), MILLIMETRES(0.04, LENGTH),
  KILOGRAM(1000, MASS), TON(1000000, MASS), GRAM(1, MASS),
  GALLON(3.78, VOLUME), LITRES(1, VOLUME);

  private final double valueInBaseUnit;
  private final MeasurementType type;

  Unit(double valueInBaseUnit, MeasurementType type) {
    this.valueInBaseUnit = valueInBaseUnit;
    this.type = type;
  }

  public boolean isSameType(Unit unit) {
    return unit.type == this.type;
  }

  public int hash(double value) {
    return Objects.hash(this.valueInBaseUnit * value, type);
  }

  public double toUnit(double value, Unit unitToConvert) {
    double resultValue = (value * valueInBaseUnit) / unitToConvert.valueInBaseUnit;
    return (double) Math.round(resultValue * 100000) / 100000;
  }
}
