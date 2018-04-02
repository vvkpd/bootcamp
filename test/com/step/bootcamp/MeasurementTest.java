package com.step.bootcamp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class MeasurementTest {
  @Test
  public void shouldReturnTrueFor1FootEquals1Foot() {
    Measurement oneFoot = new Measurement(1.0, Unit.FEET);
    Measurement expectedFoot = new Measurement(1.0, Unit.FEET);
    assertThat(oneFoot,is(expectedFoot));
  }

  @Test
  public void shouldReturnTrueFor1FootAnd12Inches() {
    Measurement oneFoot = new Measurement(1.0, Unit.FEET);
    Measurement twelveInches = new Measurement(12.0, Unit.INCH);
    assertThat(oneFoot,is(twelveInches));
  }

  @Test
  public void shouldReturnFalseFor1And10Inches() {
    Measurement oneFoot = new Measurement(1.0, Unit.FEET);
    Measurement tenInches = new Measurement(10.0, Unit.INCH);
    assertThat(oneFoot,not(tenInches));
  }

  @Test
  public void shouldReturnTrueFor2InchesAnd5Centimetres() {
    Measurement fiveCentimetres = new Measurement(5.0, Unit.CENTIMETRES);
    Measurement twoInches = new Measurement(2.0, Unit.INCH);
    assertThat(fiveCentimetres,is(twoInches));
  }

  @Test
  public void shouldReturnFalseFor2CentimetresAnd2Inches() {
    Measurement twoInches = new Measurement(2.0, Unit.INCH);
    Measurement twoCentimetres = new Measurement(2, Unit.CENTIMETRES);
    assertThat(twoCentimetres,not(twoInches));
  }

  @Test
  public void shouldReturnTrueFor7Point8InchesAnd19Point5Centimetres() {
    Measurement sevenPoint8Inches = new Measurement(7.8, Unit.INCH);
    Measurement nineteenPoint5Centimetres = new Measurement(19.5, Unit.CENTIMETRES);
    assertThat(nineteenPoint5Centimetres,is(sevenPoint8Inches));
  }

  @Test
  public void shouldReturnTrueFor1CMAnd10MM() {
    Measurement tenMM = new Measurement(10, Unit.MILLIMETRES);
    Measurement oneCM = new Measurement(1, Unit.CENTIMETRES);
    assertThat(oneCM,is(tenMM));
  }

  @Test
  public void oneTonEquals1000KG() {
    Measurement thousandKG = new Measurement(1000, Unit.KILOGRAM);
    Measurement oneTon = new Measurement(1, Unit.TON);
    assertThat(thousandKG, is(oneTon));
  }

  @Test
  public void oneKGEquals1000G() {
    Measurement thousandG = new Measurement(1000, Unit.GRAM);
    Measurement oneKG = new Measurement(1, Unit.KILOGRAM);
    assertThat(oneKG, is(thousandG));
  }

  @Test
  public void oneGNotEquals1Litres() {
    Measurement oneG = new Measurement(1, Unit.GRAM);
    Measurement oneLitres = new Measurement(1, Unit.LITRES);
    assertThat(oneLitres, not(oneG));
  }

  @Test
  public void oneTonEquals1000000G() {
    Measurement twoTons = new Measurement(2, Unit.TON);
    Measurement twoMillionGrams = new Measurement(2000000, Unit.GRAM);
    assertThat(twoTons,is(twoMillionGrams) );
  }

  @Test
  public void onePoint5KGEquals1500G() {
    Measurement onePoint5KG = new Measurement(1.5, Unit.KILOGRAM);
    Measurement oneThousand500G = new Measurement(1500, Unit.GRAM);
    assertThat(onePoint5KG,is(oneThousand500G));
  }

  @Test
  public void oneGallonIsOneGallon() {
    Measurement oneGallon = new Measurement(1, Unit.GALLON);
    Measurement anotherOneGallon = new Measurement(1, Unit.GALLON);
    assertThat(oneGallon, is(anotherOneGallon));
  }

  @Test
  public void oneLitreIsOneLitre() {
    Measurement oneLitre = new Measurement(1, Unit.LITRES);
    Measurement anotherOneLitre = new Measurement(1, Unit.LITRES);
    assertThat(oneLitre,is(anotherOneLitre));
  }

  @Test
  public void oneGallonIs3Point78Litres() {
    Measurement oneGallon = new Measurement(1, Unit.GALLON);
    Measurement threePoint78Litres = new Measurement(3.78, Unit.LITRES);
    assertThat(oneGallon, is(threePoint78Litres));
  }

  @Test
  public void oneLtAndOneCM() {
    Measurement oneCentimetre = new Measurement(1, Unit.CENTIMETRES);
    Measurement oneLitre = new Measurement(1, Unit.LITRES);
    assertThat(oneCentimetre,not(oneLitre) );
  }
}
