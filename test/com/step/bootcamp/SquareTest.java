package com.step.bootcamp;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/*
Ensures the correctness of area, perimeter of square
 */
public class SquareTest {

  private Rectangle square;

  @Before
  public void setUp() {
    square = new Rectangle(8);
  }

  @Test
  public void shouldReturnAreaWhenSideIs5() {
    Rectangle square = new Rectangle(5);
    assertThat(square.area(),is(25.0));
  }

  @Test
  public void shouldReturnArea() {
    assertThat(square.area(), is(64.0));
  }

  @Test
  public void shouldReturnPerimeterWhenSideIs5() {
    Rectangle square = new Rectangle(5);
    assertThat(square.perimeter(),is(20.0));
  }

  @Test
  public void shouldReturnPerimeter() {
    assertThat(square.perimeter(), is(32.0));
  }
}
