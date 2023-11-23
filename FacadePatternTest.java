/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import designpattern1.ShapeMaker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author anmolvalecha
 * 
 *  JUnit test class for the Facade pattern implementation.
 */
public class FacadePatternTest {
    
    public FacadePatternTest() {
    }

    @Test
    public void testDrawCircle() {
        ShapeMaker shapeMaker = new ShapeMaker();
        String result = shapeMaker.drawCircle();
        assertEquals("Circle::draw()", result, "Unexpected result for drawing a circle");
    }

    /**
     * Test case for drawing a square using the Facade pattern.
     */
    @Test
    public void testDrawSquare() {
        ShapeMaker shapeMaker = new ShapeMaker();
        String result = shapeMaker.drawSquare();
        assertEquals("Square::draw()", result, "Unexpected result for drawing a square");
    }

    /**
     * Test case for drawing a rectangle using the Facade pattern.
     */
    @Test
    public void testDrawRectangle() {
        ShapeMaker shapeMaker = new ShapeMaker();
        String result = shapeMaker.drawRectangle();
        assertEquals("Rectangle::draw()", result, "Unexpected result for drawing a rectangle");
    }

    private void assertEquals(String circledraw, String result, String unexpected_result_for_drawing_a_circle) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

