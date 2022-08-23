package day45_Abstraction.shape;

public class Sphere extends Shape implements Volume{ //right click>>create override>>constructor
//add implements Volume
    private double radius;
    public final static double pi = 3.14;
    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;
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

    @Override
    public double area() {
        return 6*pi*radius*radius;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double volume() {
        return pi*radius*radius*radius*4/3;
    }

    @Override
    public String toString() {
        return "Sphere{" +super.toString()+  //add super keyword>>>
                ", volume="+ volume()+
                ", radius=" + radius +
                '}';
    }
}
