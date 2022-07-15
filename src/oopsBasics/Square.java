package oopsBasics;

public class Square extends Shape implements Area{

    Square(int length){
        super(length);
    }


    @Override
    public void draw(){
        System.out.println("Drawing Square");
    }

    public float calculateArea() {
        return (float) this.getLength() * this.getLength();
    }

    @Override
    public int calculatePerimeter() {
        return 4 * this.getLength();
    }

}
