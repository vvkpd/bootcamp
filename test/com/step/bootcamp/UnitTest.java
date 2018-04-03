package com.step.bootcamp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UnitTest {
  @Test
  public void oneFootShouldReturn30Centimetres() {
    double oneFoot = Unit.FEET.toUnit(1,Unit.CENTIMETRES);
    double thirtyCM = 30.0;
    assertThat(oneFoot,is(thirtyCM));
  }

  @Test
  public void twoPoint5FeetShouldReturn75Centimetres() {
    double twoPoint5Feet = Unit.FEET.toUnit(2.5,Unit.CENTIMETRES);
    double seventyFiveCM = 75.0;
    assertThat(twoPoint5Feet,is(seventyFiveCM));
  }

  @Test
  public void oneInchShouldReturn2Point5Centimetres() {
    double oneInch = Unit.INCH.toUnit(1,Unit.CENTIMETRES);
    double twoPoint5CM = 2.5;
    assertThat(oneInch,is(twoPoint5CM));
  }

  @Test
  public void twoPoint5InchShouldReturn6Point25Centimetres() {
    double twoPoint5Inch = Unit.INCH.toUnit(2.5,Unit.CENTIMETRES);
    double sixPoint25CM = 6.25;
    assertThat(twoPoint5Inch,is(sixPoint25CM));
  }

  @Test
  public void oneCentimetreShouldReturn1Centimetre() {
    double oneCM = Unit.CENTIMETRES.toUnit(1,Unit.CENTIMETRES);
    double anotherOneCM = 1.0;
    assertThat(oneCM,is(anotherOneCM));
  }

  @Test
  public void threeInchesShouldReturn7Point5Centimetres() {
    double threeInch = Unit.INCH.toUnit(3,Unit.CENTIMETRES);
    double sevenPoint5CM = 7.5;
    assertThat(threeInch,is(sevenPoint5CM));
  }

  @Test
  public void tenMMShouldReturn1CM() {
    double tenMM = Unit.MILLIMETRES.toUnit(10,Unit.CENTIMETRES);
    double oneCM = 1.0;
    assertThat(tenMM,is(oneCM));
  }

  @Test
  public void oneGramShouldReturn1G() {
    assertThat(Unit.GRAM.toUnit(1,Unit.GRAM),is(1.0));
  }

  @Test
  public void oneKGShouldReturn1000G() {
    assertThat(Unit.KILOGRAM.toUnit(1,Unit.GRAM),is(1000.0) );
  }

  @Test
  public void oneTonShouldReturn1000000G() {
    assertThat(Unit.TON.toUnit(1,Unit.GRAM),is(1000000.0) );
  }

  @Test
  public void shouldReturn3point78For1Litre() {
    double oneGallon = Unit.GALLON.toUnit(1,Unit.LITRES);
    double threePoint78Litres = 3.78;
    assertThat(oneGallon,is(threePoint78Litres));
  }

  @Test
  public void oneLitreShouldReturn1Litre() {
    double oneLitre = Unit.LITRES.toUnit(1,Unit.LITRES);
    double anotherOneLitre = 1.0;
    assertThat(oneLitre,is(anotherOneLitre) );
  }
}
