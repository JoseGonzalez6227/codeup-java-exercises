package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape1 = new Rectangle(4, 5);
        Measurable myShape2 = new Square(5);

        System.out.println("Rectangle -- Area is: " + myShape1.getArea() + " & Perimeter is: " + myShape1.getPerimeter());
        System.out.println("Square -- Area is: " + myShape2.getArea() + " & Perimeter is: " + myShape2.getPerimeter());

    }

}
