package day45_Abstraction.shape;

public class Square extends Shape{
//3-add>>Square extends Shape
    //1-side
    private double side;
//5- constructor>>clean /string name>>
    public Square( double side) {
        super("Square");
        setSide(side);
    }
//2- getter setter
    public double getSide() {
        return side;
    }
    public void setSide(double side) {          //add if negative
        if(side <= 0){
            throw new RuntimeException("Invalid Side: "+side);  //add RuntimeException
        }
        this.side = side;
    }
//area
    public double area() {
        return side * side;
    }
//3-perimeter
    public double perimeter() {
        return side * 4;
    }

    //4-generate>>toString
    @Override
    public String toString() {
        return "Square{" +
                super.toString()+  //add>> super.toString()+ keyword(parent`s class toString)
                "side=" + side +
                '}';
    }

}
