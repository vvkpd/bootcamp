package com.step.bootcamp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MassUnitTest {
  @Test
  public void oneGramShouldReturn1G() {
    assertThat(MassUnit.GRAM.toBaseUnit(1),is(1.0));
  }

  @Test
  public void oneKGShouldReturn1000G() {
    assertThat(MassUnit.KILOGRAM.toBaseUnit(1),is(1000.0) );
  }

  @Test
  public void oneTonShouldReturn1000000G() {
    assertThat(MassUnit.TON.toBaseUnit(1),is(1000000.0) );
  }
}