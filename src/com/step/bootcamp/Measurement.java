package com.step.bootcamp;


public class Measurement {
  private final double value;
  private final Unit unit;

  public Measurement(double value, Unit unit) {
    this.value = value;
    this.unit = unit;
  }

  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    if (another == null || getClass() != another.getClass()) return false;
    Measurement measurement = (Measurement) another;
    return measurement.unit.isSameType(unit) && Double.compare(unit.toUnit(value, measurement.unit), measurement.value) == 0;
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
    return unit.hash(value);
  }

  public Measurement add(Measurement measurement) throws InCompatibleUnitTypeException {
    typeValidator(measurement.unit, "Can not add different type of units");
    double resultValue = measurement.unit.toUnit(measurement.value, unit);
    return new Measurement(resultValue + value, unit);
  }

  public Measurement toUnit(Unit type) throws InCompatibleUnitTypeException {
    typeValidator(type, "Can not convert different Types of units");
    double result = unit.toUnit(value, type);
    return new Measurement(result, type);
  }

  private void typeValidator(Unit type, String message) throws InCompatibleUnitTypeException {
    if (!unit.isSameType(type)) throw new InCompatibleUnitTypeException(message);
  }
}