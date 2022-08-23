package day45_Abstraction.shape;

public class Triangle extends Shape{ //right click>>create override>>constructor
    private double height,base,side1,side2; //height

    public Triangle(String name, double height, double base, double side1, double side2) {
        super(name);
        this.height = height;
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height <= 0){
            throw new RuntimeException("Invalid height: "+height);  //add RuntimeException
        }
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if(base <= 0){
            throw new RuntimeException("Invalid base: "+base);  //add RuntimeException
        }
        this.base = base;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        if(side1 <= 0){
            throw new RuntimeException("Invalid side1: "+side1);  //add RuntimeException
        }
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        if(side2 <= 0){
            throw new RuntimeException("Invalid side2: "+side2);  //add RuntimeException
        }
        this.side2 = side2;
    }

    @Override
    public double area() {
        return height*base*0.5;
    }

    @Override
    public double perimeter() {
        return side1+side1+base;
    }

    @Override
    public String toString() {
        return "Triangle{" +super.toString()+
                ", height=" + height +
                ", base=" + base +
                ", side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }
}
