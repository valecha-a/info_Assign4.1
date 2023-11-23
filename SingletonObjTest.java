/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import singletondesignpattern.SingletonObj;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * JUnit test class for the SingletonObj class.
 * Demonstrates that only a single object can be created.
 * 
 * @version 4.0
 * 
 * @author anmolvalecha
 */
public class SingletonObjTest {
    /**
     * Default constructor for SingletonObjTest.
     */
    public SingletonObjTest() {
    }
    /**
     * Test of getInstance method, of class SingletonObj.
     */
    @Test
    public void testGetInstance() {
        // Create two instances of SingletonObj
        SingletonObj instance1 = SingletonObj.getInstance();
        SingletonObj instance2 = SingletonObj.getInstance();

        // Check that both instances are the same object
        assertSame( instance1, instance2);
        
    }
}
