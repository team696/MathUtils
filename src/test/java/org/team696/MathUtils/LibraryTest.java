/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.team696.MathUtils;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void test360Wrap() {
        MathUtils obj = new MathUtils();
        double[] testVals = new double[]        {0, 1, -1,  90.5, -90.5,  179.5, -179.5,  359.5, -359.5, 360, -360, 361, -361};
        double[] expected360Vals = new double[] {0, 1, 359, 90.5,  269.5, 179.5,  180.5,  359.5, 0.5,    0,    0,   1,    359};
        double[] expected180Vals = new double[] {0, 1, -1,  90.5, -90.5,  179.5, -179.5, -0.5,   0.5,    0,    0,   1,    -1};
        double[] resultVals = new double[testVals.length];
        int i; 
        for(i=0; i<testVals.length; i++){
          resultVals[i] = obj.wrapAngle360(testVals[i]);
        }
        assertArrayEquals(expected360Vals, resultVals, 0.000001);
        for(i=0; i<testVals.length; i++){
          resultVals[i] = obj.wrapAngle180(testVals[i]);
        }
        assertArrayEquals(expected180Vals, resultVals, 0.000001);
    }
}
