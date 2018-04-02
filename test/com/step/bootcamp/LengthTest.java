package com.step.bootcamp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class LengthTest {

  @Test
  public void shouldReturnTrueFor1FootEquals1Foot() {
    Length oneFoot = new Length(1.0, LengthUnit.FEET);
    Length expectedFoot = new Length(1.0, LengthUnit.FEET);
    assertThat(oneFoot,is(expectedFoot));
  }

  @Test
  public void shouldReturnTrueFor1FootAnd12Inches() {
    Length oneFoot = new Length(1.0, LengthUnit.FEET);
    Length twelveInches = new Length(12.0, LengthUnit.INCH);
    assertThat(oneFoot,is(twelveInches));
  }

  @Test
  public void shouldReturnFalseFor1And10Inches() {
    Length oneFoot = new Length(1.0, LengthUnit.FEET);
    Length tenInches = new Length(10.0, LengthUnit.INCH);
    assertThat(oneFoot,not(tenInches));
  }

  @Test
  public void shouldReturnTrueFor2InchesAnd5Centimetres() {
    Length fiveCentimetres = new Length(5.0, LengthUnit.CENTIMETRES);
    Length twoInches = new Length(2.0, LengthUnit.INCH);
    assertThat(fiveCentimetres,is(twoInches));
  }

  @Test
  public void shouldReturnFalseFor2CentimtresAnd2Inches() {
    Length twoInches = new Length(2.0, LengthUnit.INCH);
    Length twoCentimetres = new Length(2, LengthUnit.CENTIMETRES);
    assertThat(twoCentimetres,not(twoInches));
  }

  @Test
  public void shouldReturnTrueFor7Point8InchesAnd19Point5Centimetres() {
    Length sevenPoint8Inches = new Length(7.8, LengthUnit.INCH);
    Length nineteenPoint5Centimetres = new Length(19.5, LengthUnit.CENTIMETRES);
    assertThat(nineteenPoint5Centimetres,is(sevenPoint8Inches));
  }

  @Test
  public void shouldReturnTrueFor1CMAnd10MM() {
    Length tenMM = new Length(10, LengthUnit.MILLIMETRES);
    Length oneCM = new Length(1, LengthUnit.CENTIMETRES);
    assertThat(oneCM,is(tenMM));
  }
}
