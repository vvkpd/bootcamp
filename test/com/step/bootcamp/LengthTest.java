package com.step.bootcamp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class LengthTest {

  @Test
  public void shouldReturnTrueFor1FootEquals1Foot() {
    Measurement<LengthUnit> oneFoot = new Measurement<>(1.0, LengthUnit.FEET);
    Measurement<LengthUnit> expectedFoot = new Measurement<>(1.0, LengthUnit.FEET);
    assertThat(oneFoot,is(expectedFoot));
  }

  @Test
  public void shouldReturnTrueFor1FootAnd12Inches() {
    Measurement<LengthUnit> oneFoot = new Measurement<>(1.0, LengthUnit.FEET);
    Measurement<LengthUnit> twelveInches = new Measurement<>(12.0, LengthUnit.INCH);
    assertThat(oneFoot,is(twelveInches));
  }

  @Test
  public void shouldReturnFalseFor1And10Inches() {
    Measurement<LengthUnit> oneFoot = new Measurement<>(1.0, LengthUnit.FEET);
    Measurement<LengthUnit> tenInches = new Measurement<>(10.0, LengthUnit.INCH);
    assertThat(oneFoot,not(tenInches));
  }

  @Test
  public void shouldReturnTrueFor2InchesAnd5Centimetres() {
    Measurement<LengthUnit> fiveCentimetres = new Measurement<>(5.0, LengthUnit.CENTIMETRES);
    Measurement<LengthUnit> twoInches = new Measurement<>(2.0, LengthUnit.INCH);
    assertThat(fiveCentimetres,is(twoInches));
  }

  @Test
  public void shouldReturnFalseFor2CentimtresAnd2Inches() {
    Measurement<LengthUnit> twoInches = new Measurement<>(2.0, LengthUnit.INCH);
    Measurement<LengthUnit> twoCentimetres = new Measurement<>(2, LengthUnit.CENTIMETRES);
    assertThat(twoCentimetres,not(twoInches));
  }

  @Test
  public void shouldReturnTrueFor7Point8InchesAnd19Point5Centimetres() {
    Measurement<LengthUnit> sevenPoint8Inches = new Measurement<>(7.8, LengthUnit.INCH);
    Measurement<LengthUnit> nineteenPoint5Centimetres = new Measurement<>(19.5, LengthUnit.CENTIMETRES);
    assertThat(nineteenPoint5Centimetres,is(sevenPoint8Inches));
  }

  @Test
  public void shouldReturnTrueFor1CMAnd10MM() {
    Measurement<LengthUnit> tenMM = new Measurement<>(10, LengthUnit.MILLIMETRES);
    Measurement<LengthUnit> oneCM = new Measurement<>(1, LengthUnit.CENTIMETRES);
    assertThat(oneCM,is(tenMM));
  }
}
