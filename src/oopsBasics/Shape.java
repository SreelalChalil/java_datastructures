package oopsBasics;

import java.sql.SQLOutput;

abstract class Shape {
    private int length;
    private int breadth;
    private int height;

    Shape(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    Shape(int length){
        this.length = length;
    }

    Shape(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }


    abstract public void draw();


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

