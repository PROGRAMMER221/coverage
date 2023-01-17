package demo;

import java.lang.Math;
import org.junit.Assert;
import org.junit.Test;


public class CircumferenceTests {
    private Circumference c = new Circumference();
    // Triangle
    @Test
    public void checkTriangleValidInput(){
        double a = 10;
        double b = 10;
        double z = 10;
        double actual = c.triangle(a,b,z);
        double expected = 30;
        Assert.assertEquals(0, Double.compare(expected, actual));
    }
    @Test
    public void checkTriangleAreaInvalidAInput(){
        double a = -10;
        double b = 10;
        double z = 10;
        double actual = c.triangle(a,b,z);
        double expected = 0;
        Assert.assertEquals(0, Double.compare(expected, actual));
    }

}
