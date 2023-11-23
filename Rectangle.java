/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern1;

/**
 * Rectangle class implementing the Shape interface.
 * It represents a rectangle shape.
 *
 * @author anmolvalecha
 * @version 1.0
 */
public class Rectangle implements Shape {
     /**
     * Draws the rectangle and returns a string representation.
     *
     * @return A string representing the drawn rectangle.
     */
    @Override
    public String draw() {
        return "Rectangle::draw()";
    }
}