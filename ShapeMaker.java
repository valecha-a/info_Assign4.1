/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern1;

/**
 * Facade class providing simplified methods for drawing shapes.
 * It internally uses instances of Circle, Square, and Rectangle to draw respective shapes.
 *
 * @author anmolvalecha
 * @version 1.0
 */
public class ShapeMaker {
    private Shape circle;
    private Shape square;
    private Shape rectangle;

    /**
     * Constructor to initialize ShapeMaker with instances of Circle, Square, and Rectangle.
     */
    public ShapeMaker() {
        this.circle = new Circle();
        this.square = new Square();
        this.rectangle = new Rectangle();
    }

    /**
     * Draws a circle using the internally stored Circle instance.
     *
     * @return A string representing the drawn circle.
     */
    public String drawCircle() {
        return circle.draw();
    }

     /**
     * Draws a square using the internally stored Square instance.
     *
     * @return A string representing the drawn square.
     */
    public String drawSquare() {
        return square.draw();
    }

     /**
     * Draws a rectangle using the internally stored Rectangle instance.
     *
     * @return A string representing the drawn rectangle.
     */
    public String drawRectangle() {
        return rectangle.draw();
    }
}

