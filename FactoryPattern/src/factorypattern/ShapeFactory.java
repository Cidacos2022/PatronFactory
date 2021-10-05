/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

import factorypattern.Model.Circle;
import factorypattern.Model.IShape;
import factorypattern.Model.Rectangle;
import factorypattern.Model.Square;

/**
 *
 * @author rafael
 */
public class ShapeFactory {

    public IShape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();

        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();

        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }
}
