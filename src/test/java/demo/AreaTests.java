package demo;

import java.lang.Math;
import org.junit.Assert;
import org.junit.Test;


public class AreaTests {
  private Area Area = new Area();
  // Triangle
  @Test
  public void checkTriangleAreaValidInput(){
    double b = 10;
    double h = 20;
    double actual = Area.triangle(b,h);
    double expected = 100;
    Assert.assertEquals(0, Double.compare(expected, actual));
  }

}
