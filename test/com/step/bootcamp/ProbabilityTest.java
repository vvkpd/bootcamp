package com.step.bootcamp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/*
* Ensures correctness of negation of probability
*/
public class ProbabilityTest {
  @Test
  public void shouldReturnChancesOfGettingTail() {
    Probability probability = new Probability(0.4);
    assertThat(probability.negation(), is(new Probability(0.6)));
  }

  @Test
  public void shouldReturnTrueWhenSameObject() {
    Probability probability = new Probability(0.1);
    assertEquals(probability,probability );
  }

  @Test
  public void shouldReturnFalseWhenSameObjectButDifferentValues() {
    Probability probability = new Probability(0.8);
    Probability probability1 = new Probability(0.5);
    assertNotEquals(probability,probability1);
  }

  @Test
  public void shouldReturnFalseForNull() {
    Probability probability = new Probability(0.9);
    assertNotEquals(null,probability);
  }

  @Test
  public void shouldReturnFalseForAnotherObject() {
    Probability probability = new Probability(0.2);
    assertNotEquals(new Object(),probability);
  }

  @Test
  public void shouldReturnTrueForTwoEqualObjects() {
    Probability probability1 = new Probability(0.3);
    Probability probability2 = new Probability(0.3);
    assertEquals(probability1, probability2);
    assertEquals(probability2, probability1);
  }

  @Test
  public void shouldReturnTrueForThreeEqualObjects() {
    Probability probability1 = new Probability(0.4);
    Probability probability2 = new Probability(0.4);
    Probability probability3 = new Probability(0.4);
    assertEquals(probability1, probability2);
    assertEquals(probability2, probability3);
    assertEquals(probability3, probability1);
  }

  @Test
  public void shouldReturnTrue() {
    Probability probability = new Probability(0.8);
    assertEquals(probability.negation(), new Probability(0.2));
  }

  @Test
  public void shouldReturnAndOfTwoProbabilitiesWithSameValues() {
    Probability probability1 = new Probability(0.5);
    Probability probability2 = new Probability(0.5);
    assertEquals(new Probability(0.25),probability1.and(probability2));
  }

  @Test
  public void shouldReturnAndOfTwoProbabilitiesWithDifferentValues() {
    Probability probability1 = new Probability(0.4);
    Probability probability2 = new Probability(0.5);
    assertEquals(new Probability(0.20),probability1.and(probability2));
  }

  @Test
  public void shouldReturnAndOfTwoProbabilitiesWithTwoDecimalPlaces() {
    Probability probability1 = new Probability(0.53);
    Probability probability2 = new Probability(0.42);
    assertEquals(new Probability(0.2226),probability1.and(probability2));
  }

  @Test
  public void shouldReturnAndOfProbabilitiesOf1And0() {
    Probability probability1 = new Probability(0);
    Probability probability2 = new Probability(1);
    assertEquals(new Probability(0),probability1.and(probability2));
  }

  @Test
  public void shouldReturnAndOfProbabilitiesOfDiceCoinCards() {
    Probability tail = new Probability(0.5);
    Probability face5 = new Probability(0.16666);
    Probability redCard = new Probability(0.5);
    Probability result = tail.and(face5).and(redCard);
    assertEquals(new Probability(0.04165),result);
  }

  @Test
  public void shouldReturnOrOfTwoProbabilities() {
    Probability probability1 = new Probability(0.5);
    Probability probability2 = new Probability(0.5);
    assertEquals(new Probability(0.75), probability1.or(probability2));
  }
}
