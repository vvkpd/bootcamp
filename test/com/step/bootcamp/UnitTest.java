package com.step.bootcamp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UnitTest {
  @Test
  public void oneFootShouldReturn30Centimetres() {
    double oneFoot = Unit.FEET.toBaseUnit(1);
    double thirtyCM = 30.0;
    assertThat(oneFoot,is(thirtyCM));
  }

  @Test
  public void twoPoint5FeetShouldReturn75Centimetres() {
    double twoPoint5Feet = Unit.FEET.toBaseUnit(2.5);
    double seventyFiveCM = 75.0;
    assertThat(twoPoint5Feet,is(seventyFiveCM));
  }

  @Test
  public void oneInchShouldReturn2Point5Centimetres() {
    double oneInch = Unit.INCH.toBaseUnit(1);
    double twoPoint5CM = 2.5;
    assertThat(oneInch,is(twoPoint5CM));
  }

  @Test
  public void twoPoint5InchShouldReturn6Point25Centimetres() {
    double twoPoint5Inch = Unit.INCH.toBaseUnit(2.5);
    double sixPoint25CM = 6.25;
    assertThat(twoPoint5Inch,is(sixPoint25CM));
  }

  @Test
  public void oneCentimetreShouldReturn1Centimetre() {
    double oneCM = Unit.CENTIMETRES.toBaseUnit(1);
    double anotherOneCM = 1.0;
    assertThat(oneCM,is(anotherOneCM));
  }

  @Test
  public void threeInchesShouldReturn7Point5Centimetres() {
    double threeInch = Unit.INCH.toBaseUnit(3);
    double sevenPoint5CM = 7.5;
    assertThat(threeInch,is(sevenPoint5CM));
  }

  @Test
  public void tenMMShouldReturn1CM() {
    double tenMM = Unit.MILLIMETRES.toBaseUnit(10);
    double oneCM = 1.0;
    assertThat(tenMM,is(oneCM));
  }

  @Test
  public void oneGramShouldReturn1G() {
    assertThat(Unit.GRAM.toBaseUnit(1),is(1.0));
  }

  @Test
  public void oneKGShouldReturn1000G() {
    assertThat(Unit.KILOGRAM.toBaseUnit(1),is(1000.0) );
  }

  @Test
  public void oneTonShouldReturn1000000G() {
    assertThat(Unit.TON.toBaseUnit(1),is(1000000.0) );
  }

  @Test
  public void shouldReturn3point78For1Litre() {
    double oneGallon = Unit.GALLON.toBaseUnit(1);
    double threePoint78Litres = 3.78;
    assertThat(oneGallon,is(threePoint78Litres));
  }

  @Test
  public void oneLitreShouldReturn1Litre() {
    double oneLitre = Unit.LITRES.toBaseUnit(1);
    double anotherOneLitre = 1.0;
    assertThat(oneLitre,is(anotherOneLitre) );
  }
}
