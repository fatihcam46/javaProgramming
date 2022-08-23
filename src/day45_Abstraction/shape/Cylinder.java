package day45_Abstraction.shape;

public class Cylinder extends Shape implements Volume{ //right click>>create override>>constructor
//1-Cylinder extends Shape   //add implements Volume
    private double radius,height;
    public final static double pi = 3.14;

    public Cylinder(String name, double radius, double height) {
        super(name);
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            throw new RuntimeException("Invalid radius: "+radius);  //add RuntimeException
        }
        this.radius = radius;
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

    @Override
    public double area() {
        return 2*pi*radius*height;
    }

    @Override
    public double perimeter() {
        return 0;
    }


    @Override
    public double volume() {
        return pi*radius*radius*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +super.toString()+  //add super keyword>>>
                ", volume="+ volume()+
                ", radius=" + radius +
                ", height=" + height +
                '}';
    }
}
