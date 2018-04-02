package com.step.bootcamp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LengthUnitTest {
  @Test
  public void oneFootShouldReturn30Centimetres() {
    double oneFoot = LengthUnit.FEET.toBaseUnit(1);
    double thirtyCM = 30.0;
    assertThat(oneFoot,is(thirtyCM));
  }

  @Test
  public void twoPoint5FeetShouldReturn75Centimetres() {
    double twoPoint5Feet = LengthUnit.FEET.toBaseUnit(2.5);
    double seventyFiveCM = 75.0;
    assertThat(twoPoint5Feet,is(seventyFiveCM));
  }

  @Test
  public void oneInchShouldReturn2Point5Centimetres() {
    double oneInch = LengthUnit.INCH.toBaseUnit(1);
    double twoPoint5CM = 2.5;
    assertThat(oneInch,is(twoPoint5CM));
  }

  @Test
  public void twoPoint5InchShouldReturn6Point25Centimetres() {
    double twoPoint5Inch = LengthUnit.INCH.toBaseUnit(2.5);
    double sixPoint25CM = 6.25;
    assertThat(twoPoint5Inch,is(sixPoint25CM));
  }

  @Test
  public void oneCentimetreShouldReturn1Centimetre() {
    double oneCM = LengthUnit.CENTIMETRES.toBaseUnit(1);
    double anotherOneCM = 1.0;
    assertThat(oneCM,is(anotherOneCM));
  }

  @Test
  public void threeInchesShouldReturn7Point5Centimetres() {
    double threeInch = LengthUnit.INCH.toBaseUnit(3);
    double sevenPoint5CM = 7.5;
    assertThat(threeInch,is(sevenPoint5CM));
  }

  @Test
  public void tenMMShouldReturn1CM() {
    double tenMM = LengthUnit.MILLIMETRES.toBaseUnit(10);
    double oneCM = 1.0;
    assertThat(tenMM,is(oneCM));
  }

}
