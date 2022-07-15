package oopsBasics;

public class Rectangle extends Shape implements Area{
    Rectangle(int length, int breadth){
        super(length, breadth);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    public float calculateArea(){
        return (float) this.getLength() * this.getBreadth();
    }

    public int calculatePerimeter(){
        return (2 * this.getLength()) + (2 * this.getBreadth());
    }
}
