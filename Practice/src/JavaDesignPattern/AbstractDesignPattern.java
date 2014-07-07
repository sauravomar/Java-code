package JavaDesignPattern;

/**
 * Created by saurav on 29/6/14.
 */

interface Shape {
    void draw();
}
class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

interface Color {
    void fill();
}
class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill method.");
    }
}

abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}

class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}

class ColorFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }
        return null;
    }
}
class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}

public class AbstractDesignPattern {

    public static void main(String args[]){

        AbstractFactory shape = FactoryProducer.getFactory("shape");
        Shape shape1 = shape.getShape("rectangle");
        shape1.draw();

        AbstractFactory color = FactoryProducer.getFactory("color");
        Color color1 = color.getColor("red");
        color1.fill();

    }


}
