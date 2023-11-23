/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test class for the ShapeFactory and Shape implementations.
 * 
 * @author anmolvalecha
 */
public class FactoryPatternTest {
    
    public FactoryPatternTest() {
    }

    /**
     * Test case for creating a Circle shape.
     */
    @Test
    public void testCreateCircle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("CIRCLE");
        assertNotNull( "Circle should not be null");
        assertEquals("Inside Circle::draw() method.", captureSystemOut(shape::draw), "Unexpected output for Circle");
    }

    /**
     * Test case for creating a Rectangle shape.
     */
    @Test
    public void testCreateRectangle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("RECTANGLE");
        assertNotNull( "Rectangle should not be null");
        assertEquals("Inside Rectangle::draw() method.", captureSystemOut(shape::draw), "Unexpected output for Rectangle");
    }

    /**
     * Test case for creating a Square shape.
     */
    @Test
    public void testCreateSquare() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("SQUARE");
        assertNotNull( "Square should not be null");
        assertEquals("Inside Square::draw() method.", captureSystemOut(shape::draw), "Unexpected output for Square");
    }

    // Helper method to capture System.out.println output
    private String captureSystemOut(Runnable runnable) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        try {
            runnable.run();
            return outputStream.toString().trim();
        } finally {
            System.setOut(originalOut);
        }
    }
}
