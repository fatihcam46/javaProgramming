package day31_Constructors;

public class Rectangle {
    //Attributes
    public double length, width;

//constructor generate>>>>
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

   // Actions  calculateArea  calculatePerimeter
    public double calcArea(){
        return length * width;
    }

    public double calcPerimeter(){
        return 2 * (length + width);
    }

//to string>>>generate
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calcArea() +//add calc area   perimeter
                ", perimeter=" + calcPerimeter() +
                '}';
    }

}
/*
create a custom class named Rectangle
    Attributes:
        length, width
    Add a constructor that can set all the fields
    Actions:
        calculateArea(): calculates the area of the rectangle, returns it as double
        calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
     	toString(): displays the width, length, area and perimeter of the rectangle when an
     	object of rectangle passed in the print statement
 */