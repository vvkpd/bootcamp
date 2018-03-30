package com.step.bootcamp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class LengthTest {

  @Test
  public void shouldReturnTrueFor1FootEquals1Foot() {
    Length oneFoot = Length.inFeet(1.0);
    Length expectedFoot = Length.inFeet(1.0);
    assertThat(oneFoot,is(expectedFoot));
  }

  @Test
  public void shouldReturnTrueFor1FootAnd12Inches() {
    Length oneFoot = Length.inFeet(1.0);
    Length twelveInches = Length.inInches(12.0);
    assertThat(oneFoot,is(twelveInches));
  }

  @Test
  public void shouldReturnFalseFor1And10Inches() {
    Length oneFoot = Length.inFeet(1.0);
    Length tenInches = Length.inInches(10.0);
    assertThat(oneFoot,not(tenInches));
  }
}
