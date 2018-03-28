package com.step.bootcamp;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/*
Ensures the correctness of area, perimeter of rectangle
 */
public class RectangleTest {

  private Rectangle rectangle;

  @Before
  public void setUp() {
    rectangle = new Rectangle(5, 8);
  }

  @Test
  public void shouldCalculateTheArea() {
    assertThat(rectangle.area(), is(40.0));
  }

  @Test
  public void shouldReturnPerimeter() {
    assertThat(rectangle.perimeter(),is(26.0));
  }
}
