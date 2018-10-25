import java.util.ArrayList;
import java.util.Collection;

public class ShapeTester {

    public static void main(String[] args) {
        for(Shape shape: getShapes()){
            shape.draw();
        }
    }    private static Collection<Shape> getShapes() {
        Collection<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle());
        shapes.add(new Circle());
        shapes.add(new Sphere());
        shapes.add(new Rectangle());
        shapes.add(new Circle());
        shapes.add(new Sphere());
//        shapes.add(new Square(20,30));
        return shapes;
    }


}
