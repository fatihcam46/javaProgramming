package day45_Abstraction.shape;

public class Cube extends Shape implements Volume{ //right click>>create override>>constructor
//1-Cube extends Shape    //add implements Volume

    //1-side
    private double side;
    //2-constructor
    public Cube(double side) {
        super("Cube");
        setSide(side);
    }
//getter setter
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){
            throw new RuntimeException("Invalid Side: "+side);  //add RuntimeException
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side * side * 6 ;
    }

    @Override
    public double perimeter() {
        return 0 ;
    }


    @Override
    public double volume() {
        return side*side*side;
    }

    @Override
    public String toString() {
        return "Cube{" +super.toString()+  //add super keyword>>>
                ", volume="+ volume()+
                ", side=" + side +
                '}';
    }
}
