/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern1;

/**
 * Square class implementing the Shape interface.
 * It represents a square shape.
 *
 * @author anmolvalecha
 * @version 1.0
 */
public class Square implements Shape {
     /**
     * Draws the square and returns a string representation.
     *
     * @return A string representing the drawn square.
     */
    @Override
    public String draw() {
        return "Square::draw()";
    }
}