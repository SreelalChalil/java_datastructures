package oopsBasics;

public class Main {

        public static void main(String[] args) {

            Square square = new Square(8);
            System.out.println("Length: " + square.getLength());
            System.out.println("Breadth: " + square.getBreadth()); // Zero

            Rectangle rectangle = new Rectangle(7, 8);

            System.out.println("Length: " + rectangle.getLength());
            System.out.println("Breadth: " + rectangle.getBreadth());

            Shape s1 = new Square(3);
            Shape s2 = new Rectangle(5, 6);

            System.out.println(square.calculateArea());
            System.out.println(square.calculatePerimeter());
            square.draw();
            System.out.println(rectangle.calculateArea());
            System.out.println(rectangle.calculatePerimeter());
            rectangle.draw();


        }
}
