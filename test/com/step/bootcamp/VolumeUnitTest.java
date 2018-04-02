package com.step.bootcamp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class VolumeUnitTest {
  @Test
  public void shouldReturn3point78For1Litre() {
    double oneGallon = VolumeUnit.GALLON.toBaseUnit(1);
    double threePoint78Litres = 3.78;
    assertThat(oneGallon,is(threePoint78Litres));
  }

  @Test
  public void oneLitreShouldReturn1Litre() {
    double oneLitre = VolumeUnit.LITRES.toBaseUnit(1);
    double anotherOneLitre = 1.0;
    assertThat(oneLitre,is(anotherOneLitre) );
  }
}
