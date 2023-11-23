/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern1;

/**
 * Circle class implementing the Shape interface.
 * It represents a circle shape.
 *
 * @author anmolvalecha
 * @version 1.0
 */
public class Circle implements Shape{
     /**
     * Draws the circle and returns a string representation.
     *
     * @return A string representing the drawn circle.
     */
    @Override

    public String draw() {
        return "Circle::draw()";
       // System.out.println("Circle::draw()");
    }
    
}
