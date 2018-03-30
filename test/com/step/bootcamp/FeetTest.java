package com.step.bootcamp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FeetTest {
  @Test
  public void shouldReturnTrueFor1FootEquals1Foot() {
    Feet feet = new Feet(1.0);
    assertThat(feet,is(new Feet(1.0)));
  }

  @Test
  public void shouldReturnTrueFor1FeetAnd12Inches() {
    Feet feet = new Feet(1.0);
    assertThat(feet,is(new Inches(12.0)));
  }
}
