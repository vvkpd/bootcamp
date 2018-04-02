package com.step.bootcamp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class MassTest {
  @Test
  public void oneTonEquals1000KG() {
    Measurement<MassUnit> thousandKG = new Measurement<>(1000, MassUnit.KILOGRAM);
    Measurement<MassUnit> oneTon = new Measurement<>(1, MassUnit.TON);
    assertThat(thousandKG, is(oneTon));
  }

  @Test
  public void oneKGEquals1000G() {
    Measurement<MassUnit> thousandG = new Measurement<>(1000, MassUnit.GRAM);
    Measurement<MassUnit> oneKG = new Measurement<>(1, MassUnit.KILOGRAM);
    assertThat(oneKG, is(thousandG));
  }

  @Test
  public void oneGNotEquals1Litres() {
    Measurement<MassUnit> oneG = new Measurement<>(1, MassUnit.GRAM);
    Measurement<VolumeUnit> oneLitres = new Measurement<>(1, VolumeUnit.LITRES);
    assertThat(oneLitres, not(oneG));
  }

  @Test
  public void oneTonEquals1000000G() {
    Measurement<MassUnit> twoTons = new Measurement<>(2, MassUnit.TON);
    Measurement<MassUnit> twoMillionGrams = new Measurement<>(2000000, MassUnit.GRAM);
    assertThat(twoTons,is(twoMillionGrams) );
  }

  @Test
  public void onePoint5KGEquals1500G() {
    Measurement<MassUnit> onePoint5KG = new Measurement<>(1.5, MassUnit.KILOGRAM);
    Measurement<MassUnit> oneThousand500G = new Measurement<>(1500, MassUnit.GRAM);
    assertThat(onePoint5KG,is(oneThousand500G));
  }
}
