/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

import factorypattern.Model.IShape;

/**
 *
 * @author rafael
 */
public class FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        IShape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        IShape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        IShape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of square
        shape3.draw();
    }

}
