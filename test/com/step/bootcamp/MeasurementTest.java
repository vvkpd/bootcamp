package com.step.bootcamp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

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
    assertEquals(oneFoot.hashCode(),twelveInches.hashCode());
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
    assertEquals(fiveCentimetres.hashCode(),twoInches.hashCode());
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
//    assertEquals(sevenPoint8Inches.hashCode(),nineteenPoint5Centimetres.hashCode());
  }

  @Test
  public void shouldReturnTrueFor1CMAnd10MM() {
    Measurement tenMM = new Measurement(10, Unit.MILLIMETRES);
    Measurement oneCM = new Measurement(1, Unit.CENTIMETRES);
    assertThat(oneCM,is(tenMM));
    assertEquals(tenMM.hashCode(),oneCM.hashCode());
  }

  @Test
  public void oneTonEquals1000KG() {
    Measurement thousandKG = new Measurement(1000, Unit.KILOGRAM);
    Measurement oneTon = new Measurement(1, Unit.TON);
    assertEquals(thousandKG.hashCode(),oneTon.hashCode());
    assertThat(thousandKG, is(oneTon));
  }

  @Test
  public void oneKGEquals1000G() {
    Measurement thousandG = new Measurement(1000, Unit.GRAM);
    Measurement oneKG = new Measurement(1, Unit.KILOGRAM);
    assertThat(oneKG, is(thousandG));
    assertEquals(thousandG.hashCode(),oneKG.hashCode());
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
    assertThat(twoTons,is(twoMillionGrams));
    assertEquals(twoTons.hashCode(),twoMillionGrams.hashCode());
  }

  @Test
  public void onePoint5KGEquals1500G() {
    Measurement onePoint5KG = new Measurement(1.5, Unit.KILOGRAM);
    Measurement oneThousand500G = new Measurement(1500, Unit.GRAM);
    assertThat(onePoint5KG,is(oneThousand500G));
    assertEquals(onePoint5KG.hashCode(),oneThousand500G.hashCode());
  }

  @Test
  public void oneGallonIsOneGallon() {
    Measurement oneGallon = new Measurement(1, Unit.GALLON);
    Measurement anotherOneGallon = new Measurement(1, Unit.GALLON);
    assertThat(oneGallon, is(anotherOneGallon));
    assertEquals(oneGallon.hashCode(),anotherOneGallon.hashCode());
  }

  @Test
  public void oneLitreIsOneLitre() {
    Measurement oneLitre = new Measurement(1, Unit.LITRES);
    Measurement anotherOneLitre = new Measurement(1, Unit.LITRES);
    assertThat(oneLitre,is(anotherOneLitre));
    assertEquals(oneLitre.hashCode(),anotherOneLitre.hashCode());
  }

  @Test
  public void oneGallonIs3Point78Litres() {
    Measurement oneGallon = new Measurement(1, Unit.GALLON);
    Measurement threePoint78Litres = new Measurement(3.78, Unit.LITRES);
    assertThat(oneGallon, is(threePoint78Litres));
    assertEquals(oneGallon.hashCode(),threePoint78Litres.hashCode());
  }

  @Test
  public void oneLtAndOneCM() {
    Measurement oneCentimetre = new Measurement(1, Unit.CENTIMETRES);
    Measurement oneLitre = new Measurement(1, Unit.LITRES);
    assertThat(oneCentimetre,not(oneLitre) );
  }

  @Test
  public void shouldAdd1InchAnd1Inch() throws InCompatibleUnitTypeException {
    Measurement oneInch = new Measurement(1, Unit.INCH);
    Measurement twoInch = oneInch.add(oneInch);
    assertThat(twoInch,is(new Measurement(2,Unit.INCH)));
  }

  @Test
  public void shouldAddTwoInchToTwoInch() throws InCompatibleUnitTypeException {
    Measurement twoInch1 = new Measurement(2, Unit.INCH);
    Measurement twoInch2 = new Measurement(2, Unit.INCH);
    Measurement fourInch = twoInch1.add(twoInch2);
    assertThat(fourInch,is(new Measurement(4,Unit.INCH)));
  }

  @Test
  public void shouldNotAddDifferentTypeOfMeasurement() {
    Measurement inch = new Measurement(3, Unit.INCH);
    Measurement litre = new Measurement(3, Unit.LITRES);
    assertNotEquals(inch.hashCode(),litre.hashCode());
  }

  @Test
  public void shouldThrowExceptionWhenTryToEqualTwoDifferentTypeOfMeasurement() {
    Measurement litre = new Measurement(2, Unit.LITRES);
    Measurement inch = new Measurement(2, Unit.INCH);
    assertFalse(litre.equals(inch));
  }

  @Test
  public void shouldAdd2InchesAnd2Point5CM() throws InCompatibleUnitTypeException {
    Measurement inches = new Measurement(2, Unit.INCH);
    Measurement twoPoint5CM = new Measurement(2.5, Unit.CENTIMETRES);
    assertThat(inches.add(twoPoint5CM),is(new Measurement(3,Unit.INCH)));
  }

  @Test
  public void shouldAdd1GallonTo1Litre() throws InCompatibleUnitTypeException {
    Measurement oneLitre = new Measurement(1, Unit.LITRES);
    Measurement oneGallon = new Measurement(1, Unit.GALLON);
    assertEquals(oneGallon.add(oneLitre),new Measurement(4.78,Unit.LITRES));
  }

  @Test
  public void shouldConvert1GallonTo3point78Litres() throws InCompatibleUnitTypeException {
    Measurement gallon = new Measurement(1, Unit.GALLON);
    assertEquals(gallon.toUnit(Unit.LITRES),new Measurement(3.78,Unit.LITRES));
  }

  @Test
  public void shouldChangeLitreToGallon() throws InCompatibleUnitTypeException {
    Measurement litres = new Measurement(3.78, Unit.LITRES);
    assertEquals(litres.toUnit(Unit.GALLON),new Measurement(1,Unit.GALLON));
  }

  @Test(expected =InCompatibleUnitTypeException.class)
  public void shouldChangeGallonToKg() throws InCompatibleUnitTypeException {
    Measurement gallon = new Measurement(1, Unit.GALLON);
    Measurement kg = gallon.toUnit(Unit.KILOGRAM);
    assertEquals(kg,new Measurement(1,Unit.KILOGRAM));
  }
}
