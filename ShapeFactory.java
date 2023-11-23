/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Factory class for creating Shape instances
 * 
 * @author anmolvalecha
 */
public class ShapeFactory {
    /**
     * Gets a shape instance based on the provided shape type.
     *
     * @param shapeType The type of shape to create.
     * @return A concrete Shape instance based on the shapeType, or null if the type is invalid.
     */
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
       if(shapeType.equalsIgnoreCase("CIRCLE")){
           return new Circle();
       } 
       if(shapeType.equalsIgnoreCase("RECTANGLE")){
           return new Rectangle(); 
        }
       if(shapeType.equalsIgnoreCase("SQUARE")){
           return new Square();
       }
    return null;
    }
}
