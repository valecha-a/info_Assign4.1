/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletondesignpattern;

/**
 * SingletonObj class represents a singleton object.
 *
 * @version 4.0
 * 
 * @author anmolvalecha
 */
public class SingletonObj {
    //create an object of SingleObject
    private static SingletonObj instance = new SingletonObj();
    /**
     * Private constructor to prevent instantiation outside the class.
     */
    private SingletonObj(){}
    /**
     * Get the instance of SingletonObj.
     *
     * @return The singleton instance of SingletonObj.
     */
    public static SingletonObj getInstance(){
        return instance;
    }
    /**
     * Display a success message for the implementation of the Singleton Pattern.
     */
    public void showMessage(){
        System.out.println("Successfull implementation of Singleton Pattern");
    
    }
}

    
