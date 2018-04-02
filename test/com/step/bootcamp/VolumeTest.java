package com.step.bootcamp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class VolumeTest {
  @Test
  public void oneGallonIsOneGallon() {
    Measurement<VolumeUnit> oneGallon = new Measurement<>(1, VolumeUnit.GALLON);
    Measurement<VolumeUnit> anotherOneGallon = new Measurement<>(1, VolumeUnit.GALLON);
    assertThat(oneGallon, is(anotherOneGallon));
  }

  @Test
  public void oneLitreIsOneLitre() {
    Measurement<VolumeUnit> oneLitre = new Measurement<>(1, VolumeUnit.LITRES);
    Measurement<VolumeUnit> anotherOneLitre = new Measurement<>(1, VolumeUnit.LITRES);
    assertThat(oneLitre,is(anotherOneLitre));
  }

  @Test
  public void oneGallonIs3Point78Litres() {
    Measurement<VolumeUnit> oneGallon = new Measurement<>(1, VolumeUnit.GALLON);
    Measurement<VolumeUnit> threePoint78Litres = new Measurement<>(3.78, VolumeUnit.LITRES);
    assertThat(oneGallon, is(threePoint78Litres));
  }

  @Test
  public void oneLtAndOneCM() {
    Measurement<LengthUnit> oneCentimetre = new Measurement<>(1, LengthUnit.CENTIMETRES);
    Measurement<VolumeUnit> oneLitre = new Measurement<>(1, VolumeUnit.LITRES);
    assertThat(oneCentimetre,not(oneLitre) );
  }
}
