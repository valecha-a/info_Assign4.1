/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern1;

/**
 * Main class to demonstrate the Facade pattern.
 * It creates a ShapeMaker instance and calls methods to draw different shapes.
 *
 * @author anmolvalecha
 * @version 1.0
 */
public class FacadePatternDemo {
     /**
     * The main method to execute the Facade pattern demonstration.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare(); 
        
    }
}
