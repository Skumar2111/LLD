package DesignPattern.Prototype;

public class ShapeClient {

    private Shape shape;

    public ShapeClient(Shape shape) {
        this.shape = shape;
    }

    public Shape createShape()
    {
        return shape.clone();
    }
}
