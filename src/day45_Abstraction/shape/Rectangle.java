package day45_Abstraction.shape;

public class Rectangle extends Shape { //right click>>create override>>constructor
    //Rectangle extends Shape

    private double length,width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length <= 0){
            throw new RuntimeException("Invalid length: "+length);  //add RuntimeException
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width <= 0){
            throw new RuntimeException("Invalid width: "+width);  //add RuntimeException
        }
        this.width = width;
    }

    @Override
    public double area() {
        return length*width ;
    }

    @Override
    public double perimeter() {
        return (length+width)*2;
    }

    public String toString() {
        return "Rectangle{" + super.toString()+
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
