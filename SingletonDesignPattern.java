/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package singletondesignpattern;

/**
 * @author anmolvalecha
 * 
 * @version 4.0
 * 
 * SingletonDesignPattern class contains the main method to demonstrate the Singleton pattern.
 * 
 */
public class SingletonDesignPattern {

    /**
     * @param args the command line arguments
     * 
     * Main method to demonstrate the Singleton pattern.
     */
    public static void main(String[] args) {
        // Get the singleton instance of SingletonObj
        SingletonObj object = SingletonObj.getInstance();
        // Display a success message
        object.showMessage();
    }
    
}
